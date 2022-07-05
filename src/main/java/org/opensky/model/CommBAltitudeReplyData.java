package org.opensky.model;

public class CommBAltitudeReplyData extends AdsbTrackData{
    private byte flightStatus;
    private byte downlinkRequest;
    private byte utilityMsg;
    private short altitudeCode;
    private byte[] message;

    public void setFlightStatus(byte flightStatus) {
        this.flightStatus = flightStatus;
    }

    public void setDownlinkRequest(byte downlinkRequest) {
        this.downlinkRequest = downlinkRequest;
    }

    public void setUtilityMsg(byte utilityMsg) {
        this.utilityMsg = utilityMsg;
    }

    public void setAltitudeCode(short altitudeCode) {
        this.altitudeCode = altitudeCode;
    }

    public void setMessage(byte[] message) {
        this.message = message;
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

    public short getAltitudeCode() {
        return altitudeCode;
    }

    public byte[] getMessage() {
        return message;
    }
}
