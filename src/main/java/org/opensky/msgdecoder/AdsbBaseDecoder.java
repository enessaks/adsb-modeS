package org.opensky.msgdecoder;

import org.opensky.data.AdsbTrackDataHolder;
import org.opensky.libadsb.ModeSDecoder;
import org.opensky.libadsb.msgs.ModeSReply;
import org.opensky.libadsb.tools;
import org.opensky.model.AdsbTrackData;

public abstract class AdsbBaseDecoder {

    protected ModeSDecoder decoder = new ModeSDecoder();

    abstract ModeSReply.subtype getMessageId();

    abstract void decode(ModeSReply modeSReply);

    protected AdsbTrackData retrieveAdsbTrack(ModeSReply modeSReply) {
        String icao24 = tools.toHexString(modeSReply.getIcao24());

        AdsbTrackData adsbTrackData;
        if (AdsbTrackDataHolder.getInstance().containsAdsbTrack(icao24))
        {
            adsbTrackData = AdsbTrackDataHolder.getInstance().getAdsbTrack(icao24);
        } else {
            adsbTrackData = new AdsbTrackData();
        }
        return adsbTrackData;

    }

    abstract void register();
}
