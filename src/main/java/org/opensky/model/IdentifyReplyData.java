package org.opensky.model;

public class IdentifyReplyData extends AdsbTrackData{
    private byte flightStatus;
    private byte downlinkRequest;
    private byte utilityMsg;
    private short identity;

    public void setFlightStatus(byte flightStatus) {
        this.flightStatus = flightStatus;
    }

    public void setDownlinkRequest(byte downlinkRequest) {
        this.downlinkRequest = downlinkRequest;
    }

    public void setUtilityMsg(byte utilityMsg) {
        this.utilityMsg = utilityMsg;
    }

    public void setIdentity(short identity) {
        this.identity = identity;
    }

    public byte getFlightStatus() {
        return flightStatus;
    }

    public byte getDownlinkRequest() {
        return downlinkRequest;
    }

    public byte getUtilityMsg() {
        return utilityMsg;
    }

    public short getIdentity() {
        return identity;
    }
}
