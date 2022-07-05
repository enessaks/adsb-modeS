package org.opensky.msgdecoder;

import org.opensky.data.AdsbTrackDataHolder;
import org.opensky.libadsb.Position;
import org.opensky.libadsb.msgs.AirbornePositionV0Msg;
import org.opensky.libadsb.msgs.ModeSReply;
import org.opensky.model.AdsbTrackData;

public class AirbornePositionV0MsgDecoder extends AdsbBaseDecoder {

    private static AirbornePositionV0MsgDecoder instance = new AirbornePositionV0MsgDecoder();

    public static AirbornePositionV0MsgDecoder getInstance() {
        return instance;
    }

    private AirbornePositionV0MsgDecoder() {
    }

    @Override
    ModeSReply.subtype getMessageId() {
        return ModeSReply.subtype.ADSB_AIRBORN_POSITION_V0;
    }

    @Override
    void decode(ModeSReply modeSReply) {
        // TODO
        AdsbTrackData adsbTrack = retrieveAdsbTrack(modeSReply);
        AirbornePositionV0Msg ap0 = (AirbornePositionV0Msg) modeSReply;

        // use CPR to decode position
        // CPR needs at least 2 positions or a reference, otherwise we get null here
        Position position = decoder.decodePosition(0L, ap0, new Position());
        if (position != null) {

            adsbTrack.setLatitude(position.getLatitude());
        }

        // update Adsb track Database
        AdsbTrackDataHolder.getInstance().putAdsbTrack(adsbTrack);
    }

    @Override
    void register() {
        AdsbMessageDispatcher.getInstance().register(getMessageId(), getInstance());
    }

}
