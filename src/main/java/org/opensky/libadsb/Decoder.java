package org.opensky.libadsb;

import org.opensky.libadsb.exceptions.BadFormatException;
import org.opensky.libadsb.exceptions.UnspecifiedFormatError;
import org.opensky.libadsb.msgs.*;

/*
 *  This file is part of org.opensky.libadsb.
 *
 *  org.opensky.libadsb is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  org.opensky.libadsb is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with org.opensky.libadsb.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * General decoder for ADS-B messages.
 *
 * @author Matthias Schäfer (schaefer@opensky-network.org)
 * @deprecated This decoder lacks support for different ADS-B versions. Use {@link ModeSDecoder} instead.
 */
public class Decoder {

	/**
	 * A easy-to-use top-down ADS-B decoder. Use msg.getType() to
	 * check the message type and then cast to the appropriate class.
	 * @param raw_message the Mode S message as byte array
	 * @return an instance of the most specialized ModeSReply possible
	 * @throws UnspecifiedFormatError if format is not specified
	 * @throws BadFormatException if format contains error
	 */
	public static ModeSReply genericDecoder (byte[] raw_message) throws BadFormatException, UnspecifiedFormatError {
		return genericDecoder(new ModeSReply(raw_message));
	}

	/**
	 * A easy-to-use top-down ADS-B decoder. Use msg.getType() to
	 * check the message type and then cast to the appropriate class.
	 * @param raw_message the Mode S message as byte array
	 * @param noCRC indicates whether the CRC has been subtracted from the parity field
	 * @return an instance of the most specialized ModeSReply possible
	 * @throws UnspecifiedFormatError if format is not specified
	 * @throws BadFormatException if format contains error
	 */
	public static ModeSReply genericDecoder (byte[] raw_message, boolean noCRC) throws BadFormatException, UnspecifiedFormatError {
		return genericDecoder(new ModeSReply(raw_message, noCRC));
	}

	/**
	 * A easy-to-use top-down ADS-B decoder. Use msg.getType() to
	 * check the message type and then cast to the appropriate class.
	 * @param raw_message the Mode S message in hex representation
	 * @return an instance of the most specialized ModeSReply possible
	 * @throws UnspecifiedFormatError if format is not specified
	 * @throws BadFormatException if format contains error
	 */
	public static ModeSReply genericDecoder (String raw_message) throws BadFormatException, UnspecifiedFormatError {
		return genericDecoder(new ModeSReply(raw_message));
	}

	/**
	 * A easy-to-use top-down ADS-B decoder. Use msg.getType() to
	 * check the message type and then cast to the appropriate class.
	 * @param raw_message the Mode S message in hex representation
	 * @param noCRC indicates whether the CRC has been subtracted from the parity field
	 * @return an instance of the most specialized ModeSReply possible
	 * @throws UnspecifiedFormatError if format is not specified
	 * @throws BadFormatException if format contains error
	 */
	public static ModeSReply genericDecoder (String raw_message, boolean noCRC) throws BadFormatException, UnspecifiedFormatError {
		return genericDecoder(new ModeSReply(raw_message, noCRC));
	}

	/**
	 * This function decodes a half-decoded Mode S reply to its
	 * deepest possible specialization. Use getType() to check its
	 * actual type afterwards.
	 * @param modes the incompletely decoded Mode S message
	 * @return an instance of the most specialized ModeSReply possible
	 * @throws UnspecifiedFormatError if format is not specified
	 * @throws BadFormatException if format contains error
	 */
	public static ModeSReply genericDecoder (ModeSReply modes) throws BadFormatException, UnspecifiedFormatError {
		switch (modes.getDownlinkFormat()) {
			case 0: return new ShortACAS(modes);
			case 4: return new AltitudeReply(modes);
			case 5: return new IdentifyReply(modes);
			case 11: return new AllCallReply(modes);
			case 16: return new LongACAS(modes);
			case 17: case 18: case 19:
				// check whether this is an ADS-B message (see Figure 2-2, RTCA DO-260B)
				if (modes.getDownlinkFormat() == 17 ||
						modes.getDownlinkFormat() == 18 && modes.getFirstField() < 2 ||
						modes.getDownlinkFormat() == 19 && modes.getFirstField() == 0) {

					// interpret ME field as standard ADS-B

					ExtendedSquitter es1090 = new ExtendedSquitter(modes);

					// what kind of extended squitter?
					byte ftc = es1090.getFormatTypeCode();

					if (ftc >= 1 && ftc <= 4) // identification message
						return new IdentificationMsg(es1090);

					if (ftc >= 5 && ftc <= 8) // surface position message
						return new SurfacePositionV0Msg(es1090);

					if ((ftc >= 9 && ftc <= 18) || (ftc >= 20 && ftc <= 22)) // airborne position message
						return new AirbornePositionV0Msg(es1090);

					if (ftc == 19) { // possible velocity message, check subtype
						int subtype = es1090.getMessage()[0] & 0x7;

						if (subtype == 1 || subtype == 2) // velocity over ground
							return new VelocityOverGroundMsg(es1090);
						else if (subtype == 3 || subtype == 4) // airspeed & heading
							return new AirspeedHeadingMsg(es1090);
					}

					if (ftc == 28) { // aircraft status message, check subtype
						int subtype = es1090.getMessage()[0] & 0x7;

						if (subtype == 1) // emergency/priority status
							return new EmergencyOrPriorityStatusMsg(es1090);
						if (subtype == 2) // TCAS resolution advisory report
							return new TCASResolutionAdvisoryMsg(es1090);
					}

					if (ftc == 29) {
						int subtype = (es1090.getMessage()[0]>>>1) & 0x3;
						if (subtype == 1) {
							// According to DO-260B 2.2.3.2.7.1 the message shall be ignored if transmitted by an
							// ADS-B v0 transponder and ME bit 11 != 0.
							// Stateless decoding does not allow this check, so it is left to the user of this method.
							// Better use the ModeSDecoder class.
							return new TargetStateAndStatusMsg(es1090);
						}
					}

					if (ftc == 31) { // operational status message
						int subtype = es1090.getMessage()[0] & 0x7;

						int version = (es1090.getMessage()[5]>>>5);
						if (subtype == 0) {
							// airborne
							switch (version) {
								case 0:
									return new OperationalStatusV0Msg(es1090);
								case 1:
									return new AirborneOperationalStatusV1Msg(es1090);
								case 2:
									return new AirborneOperationalStatusV2Msg(es1090);
							}
						} else if (subtype == 1) {
							// surface
							switch (version) {
								case 0:
									return new OperationalStatusV0Msg(es1090);
								case 1:
									return new SurfaceOperationalStatusV1Msg(es1090);
								case 2:
									return new SurfaceOperationalStatusV2Msg(es1090);
							}
						}
					}

					return es1090; // unknown extended squitter
				} else if (modes.getDownlinkFormat() == 18 && modes.getFirstField() == 6) {
					// TODO: ADS-R message (minor differences to ADS-B, see 2.2.18 in DO-260B
					return modes;
				} else if (modes.getDownlinkFormat() == 18 && modes.getFirstField() < 4 ||
						modes.getDownlinkFormat() == 18 && modes.getFirstField() == 5) {
					// TODO: TIS-B "ME" field
					// check IMF field for AA interpretation
					return modes;
				} else if (modes.getDownlinkFormat() == 18 && modes.getFirstField() == 4) {
					// TODO: TIS-B or ADS-R Management Message
					return modes;
				} else if (modes.getDownlinkFormat() == 19) {
					return new MilitaryExtendedSquitter(modes);
				}

				return modes; // this should never happen
			case 20: return new CommBAltitudeReply(modes);
			case 21: return new CommBIdentifyReply(modes);
			default:
				if (modes.getDownlinkFormat()>=24)
					return new CommDExtendedLengthMsg(modes);
				else return modes; // unknown mode s reply
		}
	}
}
