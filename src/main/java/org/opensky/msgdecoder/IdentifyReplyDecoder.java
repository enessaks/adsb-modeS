package org.opensky.msgdecoder;

import org.opensky.libadsb.msgs.ModeSReply;

public class IdentifyReplyDecoder extends AdsbBaseDecoder{
    @Override
    ModeSReply.subtype getMessageId() {
        return null;
    }

    @Override
    void decode(ModeSReply modeSReply) {

    }

    @Override
    void register() {

    }
}
