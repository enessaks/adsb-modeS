package org.opensky.msgdecoder;

import org.opensky.libadsb.ModeSDecoder;
import org.opensky.libadsb.Position;
import org.opensky.libadsb.exceptions.BadFormatException;
import org.opensky.libadsb.exceptions.UnspecifiedFormatError;
import org.opensky.libadsb.msgs.ModeSReply;
import org.opensky.model.AdsbTrackData;
import java.util.HashMap;

public class AdsbMessageDispatcher {
    public static AdsbMessageDispatcher instance = null;

    private HashMap<ModeSReply.subtype, AdsbBaseDecoder> messageDecoders = null;
    private ModeSDecoder decoder = null;

    public AdsbMessageDispatcher() {
        messageDecoders = new HashMap<>();
        decoder = new ModeSDecoder();
    }

    public static AdsbMessageDispatcher getInstance() {
        if (instance == null) {
            instance = new AdsbMessageDispatcher();
        }
        return instance;
    }

    public void decodeMessage(String raw) {

        ModeSReply modeSReply = decodeRawData(raw);

        if (messageDecoders.containsKey(modeSReply.getType())) {
            messageDecoders.get(modeSReply.getType()).decode(modeSReply);
        }
    }

    private ModeSReply decodeRawData(String raw) {
        ModeSReply msg = null;
        try {
            msg = decoder.decode(raw);
        } catch (BadFormatException e) {
            System.out.println("Malformed message! Skipping it. Message: "+e.getMessage());
        } catch (UnspecifiedFormatError e) {
            System.out.println("Unspecified message! Skipping it...");
        }
        return msg;
    }
    public void register(ModeSReply.subtype messageId, AdsbBaseDecoder decoder) {
        messageDecoders.put(messageId, decoder);
    }
}