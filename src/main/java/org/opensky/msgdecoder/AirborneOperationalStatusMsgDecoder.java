package org.opensky.msgdecoder;

import org.opensky.libadsb.msgs.AirborneOperationalStatusV1Msg;
import org.opensky.libadsb.msgs.ModeSReply;
import org.opensky.model.AdsbTrackData;
import org.opensky.model.AirborneOperationalStatusMsgData;

public class AirborneOperationalStatusMsgDecoder extends AdsbBaseDecoder{

        private static AirborneOperationalStatusMsgDecoder instance = new AirborneOperationalStatusMsgDecoder();

        public static AirborneOperationalStatusMsgDecoder getInstance() {
            return instance;
        }

        private AirborneOperationalStatusMsgDecoder() {
        }

        @Override
        ModeSReply.subtype getMessageId() {
            return ModeSReply.subtype.ADSB_AIRBORN_STATUS;
        }

        @Override
        void decode(ModeSReply modeSReply) {
            // TODO
            AirborneOperationalStatusMsgData adsbTrack =  (AirborneOperationalStatusMsgData) retrieveAdsbTrack();
            AirborneOperationalStatusV1Msg airOpStat = (AirborneOperationalStatusV1Msg) modeSReply;

            adsbTrack.setVersion(airOpStat.getVersion());
            adsbTrack.set


        }

        @Override
        void register() {
            AdsbMessageDispatcher.getInstance().register(getMessageId(), getInstance());
        }

}
