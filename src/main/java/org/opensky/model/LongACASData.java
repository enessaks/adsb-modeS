package org.opensky.model;

public class LongACASData extends AdsbTrackData{
    private boolean airborne;
    private byte sensitivityLevel;
    private byte replyInformation;
    private short altitudeCode;
    private boolean validac;
    private short activeResolutionAdvisories;
    private byte racsRecord; // RAC = resolution advisory complement
    private boolean raTerminated;
    private boolean multipleThreatEncounter;

    public void setAirborne(boolean airborne) {
        this.airborne = airborne;
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

    public void setValidac(boolean validac) {
        this.validac = validac;
    }

    public void setActiveResolutionAdvisories(short activeResolutionAdvisories) {
        this.activeResolutionAdvisories = activeResolutionAdvisories;
    }

    public void setRacsRecord(byte racsRecord) {
        this.racsRecord = racsRecord;
    }

    public void setRaTerminated(boolean raTerminated) {
        this.raTerminated = raTerminated;
    }

    public void setMultipleThreatEncounter(boolean multipleThreatEncounter) {
        this.multipleThreatEncounter = multipleThreatEncounter;
    }

    public boolean isAirborne() {
        return airborne;
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

    public boolean isValidac() {
        return validac;
    }

    public short getActiveResolutionAdvisories() {
        return activeResolutionAdvisories;
    }

    public byte getRacsRecord() {
        return racsRecord;
    }

    public boolean isRaTerminated() {
        return raTerminated;
    }

    public boolean isMultipleThreatEncounter() {
        return multipleThreatEncounter;
    }
}
