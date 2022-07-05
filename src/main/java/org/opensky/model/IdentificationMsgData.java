package org.opensky.model;

public class IdentificationMsgData extends AdsbTrackData{
    private byte emitterCategory;
    private byte[] identity;

    public void setEmitterCategory(byte emitterCategory) {
        this.emitterCategory = emitterCategory;
    }

    public void setIdentity(byte[] identity) {
        this.identity = identity;
    }

    public byte getEmitterCategory() {
        return emitterCategory;
    }

    public byte[] getIdentity() {
        return identity;
    }
}
