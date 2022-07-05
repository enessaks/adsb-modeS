package org.opensky.model;

public class ShortACASData extends AdsbTrackData{
    private boolean airborne;
    private boolean crossLinkCapability;
    private byte sensitivityLevel;
    private byte replyInformation;
    private short altitudeCode;

    public void setAirborne(boolean airborne) {
        this.airborne = airborne;
    }

    public void setCrossLinkCapability(boolean crossLinkCapability) {
        this.crossLinkCapability = crossLinkCapability;
    }

    public void setSensitivityLevel(byte sensitivityLevel) {
        this.sensitivityLevel = sensitivityLevel;
    }

    public void setReplyInformation(byte replyInformation) {
        this.replyInformation = replyInformation;
    }

    public void setAltitudeCode(short altitudeCode) {
        this.altitudeCode = altitudeCode;
    }

    public boolean isAirborne() {
        return airborne;
    }

    public boolean isCrossLinkCapability() {
        return crossLinkCapability;
    }

    public byte getSensitivityLevel() {
        return sensitivityLevel;
    }

    public byte getReplyInformation() {
        return replyInformation;
    }

    public short getAltitudeCode() {
        return altitudeCode;
    }
}
