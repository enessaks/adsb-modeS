package org.opensky.model;

public class TCASResolutionAdvisoryMsgData extends AdsbTrackData{
    private byte msgSubtype;
    private short activeRa;
    private byte racsRecord;
    private boolean raTerminated;
    private boolean multiThreatEncounter;
    private byte threatType;
    private int threatIdentity;

    public void setMsgSubtype(byte msgSubtype) {
        this.msgSubtype = msgSubtype;
    }

    public void setActiveRa(short activeRa) {
        this.activeRa = activeRa;
    }

    public void setRacsRecord(byte racsRecord) {
        this.racsRecord = racsRecord;
    }

    public void setRaTerminated(boolean raTerminated) {
        this.raTerminated = raTerminated;
    }

    public void setMultiThreatEncounter(boolean multiThreatEncounter) {
        this.multiThreatEncounter = multiThreatEncounter;
    }

    public void setThreatType(byte threatType) {
        this.threatType = threatType;
    }

    public void setThreatIdentity(int threatIdentity) {
        this.threatIdentity = threatIdentity;
    }

    public byte getMsgSubtype() {
        return msgSubtype;
    }

    public short getActiveRa() {
        return activeRa;
    }

    public byte getRacsRecord() {
        return racsRecord;
    }

    public boolean isRaTerminated() {
        return raTerminated;
    }

    public boolean isMultiThreatEncounter() {
        return multiThreatEncounter;
    }

    public byte getThreatType() {
        return threatType;
    }

    public int getThreatIdentity() {
        return threatIdentity;
    }
}
