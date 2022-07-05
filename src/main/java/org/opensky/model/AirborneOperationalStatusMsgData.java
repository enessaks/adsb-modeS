package org.opensky.model;

import org.opensky.libadsb.msgs.ModeSReply;

public class AirborneOperationalStatusMsgData extends AdsbTrackData{
    private byte subtypeCode;
    private int capabilityClassCode; // actually 16 bit unsigned
    private int operationalModeCode; // actually 16 bit unsigned
    private byte version;
    private boolean nicSuppl; // may be passed to position messages
    private byte nacPos; // navigational accuracy category - position
    private byte geometricVerticalAccuracy; // bit 49 and 50
    private byte sil; // surveillance integrity level
    private boolean nicTrkHdg; // NIC baro for airborne status, heading/ground track info else
    private boolean hrd;


    public void setSubtypeCode(byte subtypeCode) {
        this.subtypeCode = subtypeCode;
    }

    public void setCapabilityClassCode(int capabilityClassCode) {
        this.capabilityClassCode = capabilityClassCode;
    }

    public void setOperationalModeCode(int operationalModeCode) {
        this.operationalModeCode = operationalModeCode;
    }

    public void setVersion(byte version) {
        this.version = version;
    }

    public void setNicSuppl(boolean nicSuppl) {
        this.nicSuppl = nicSuppl;
    }

    public void setNacPos(byte nacPos) {
        this.nacPos = nacPos;
    }

    public void setGeometricVerticalAccuracy(byte geometricVerticalAccuracy) {
        this.geometricVerticalAccuracy = geometricVerticalAccuracy;
    }

    public void setSil(byte sil) {
        this.sil = sil;
    }

    public void setNicTrkHdg(boolean nicTrkHdg) {
        this.nicTrkHdg = nicTrkHdg;
    }

    public void setHrd(boolean hrd) {
        this.hrd = hrd;
    }

    public byte getSubtypeCode() {
        return subtypeCode;
    }

    public int getCapabilityClassCode() {
        return capabilityClassCode;
    }

    public int getOperationalModeCode() {
        return operationalModeCode;
    }

    public byte getVersion() {
        return version;
    }

    public boolean isNicSuppl() {
        return nicSuppl;
    }

    public byte getNacPos() {
        return nacPos;
    }

    public byte getGeometricVerticalAccuracy() {
        return geometricVerticalAccuracy;
    }

    public byte getSil() {
        return sil;
    }

    public boolean isNicTrkHdg() {
        return nicTrkHdg;
    }

    public boolean isHrd() {
        return hrd;
    }
}    

