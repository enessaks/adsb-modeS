package org.opensky.model;

public class OperationalStatusMsgData extends AdsbTrackData{
    private byte enroute_capabilities;

    public byte getEnroute_capabilities() {
        return enroute_capabilities;
    }

    public void setEnroute_capabilities(byte enroute_capabilities) {
        this.enroute_capabilities = enroute_capabilities;
    }
}
