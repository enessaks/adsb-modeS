package org.opensky.model;

public class MilitaryExtendedSquitterData extends AdsbTrackData{

    private byte[] message;
    private byte applicationCode;

    public void setMessage(byte[] message) {
        this.message = message;
    }

    public void setApplicationCode(byte applicationCode) {
        this.applicationCode = applicationCode;
    }

    public byte[] getMessage() {
        return message;
    }

    public byte getApplicationCode() {
        return applicationCode;
    }

}