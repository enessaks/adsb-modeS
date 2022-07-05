package org.opensky.msgdecoder;

import org.opensky.data.AdsbTrackDataHolder;
import org.opensky.libadsb.Position;
import org.opensky.libadsb.msgs.AirbornePositionV0Msg;
import org.opensky.libadsb.msgs.AirspeedHeadingMsg;
import org.opensky.libadsb.msgs.ModeSReply;
import org.opensky.model.AdsbTrackData;
import org.opensky.model.AirspeedHeadingMsgData;

public class AirspeedHeadingMsgDecoder extends AdsbBaseDecoder{
    private static AirspeedHeadingMsgDecoder instance = new AirspeedHeadingMsgDecoder();

    public static AirspeedHeadingMsgDecoder getInstance() {
        return instance;
    }

    private AirspeedHeadingMsgDecoder() {
    }

    @Override
    ModeSReply.subtype getMessageId() {
        return ModeSReply.subtype.ADSB_AIRBORN_POSITION_V0;
    }

    @Override
    void decode(ModeSReply modeSReply) {
        // TODO
        AirspeedHeadingMsgData adsbTrack = (AirspeedHeadingMsgData) retrieveAdsbTrack(modeSReply);
        AirspeedHeadingMsg ap0 = (AirspeedHeadingMsg) modeSReply;

        adsbTrack.setHeading(ap0.getHeading());
        adsbTrack.setHeadingStatusBit(ap0.hasHeadingStatusFlag());

        adsbTrack.setVerticalRateInfoAvailable(ap0.hasVerticalRateInfo());
        if(ap0.hasVerticalRateInfo()){
            adsbTrack.setVertical_rate(ap0.getVerticalRate().shortValue());
        }

        adsbTrack.setAirspeed_available(ap0.hasAirspeedInfo());
        if (ap0.hasAirspeedInfo()){
            adsbTrack.setAirspeed(ap0.getAirspeed().shortValue());
        }

        AdsbTrackDataHolder.getInstance().putAdsbTrack(adsbTrack);
    }

    @Override
    void register() {
        AdsbMessageDispatcher.getInstance().register(getMessageId(), getInstance());
    }
}

