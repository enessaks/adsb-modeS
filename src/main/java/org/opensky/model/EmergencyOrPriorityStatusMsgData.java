package org.opensky.model;

public class EmergencyOrPriorityStatusMsgData extends AdsbTrackData{
    private byte msgsubtype;
    private byte emergency_state;
    private short modeACode;

    public void setMsgsubtype(byte msgsubtype) {
        this.msgsubtype = msgsubtype;
    }

    public void setEmergency_state(byte emergency_state) {
        this.emergency_state = emergency_state;
    }

    public void setModeACode(short modeACode) {
        this.modeACode = modeACode;
    }

    public byte getMsgsubtype() {
        return msgsubtype;
    }

    public byte getEmergency_state() {
        return emergency_state;
    }

    public short getModeACode() {
        return modeACode;
    }
}
