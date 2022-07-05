package org.opensky.model;

public class SurfacePositionMsgData extends AdsbTrackData{
    private boolean horizontalPositionAvailable;
    private byte movement;
    private boolean headingstatus; // is heading valid?
    private byte groundTrack;
    private boolean timeFlag;
    private boolean cprFormat;
    private int cprEncodedLat;
    private int cprEncodedLon;
    private boolean nicSupplA;
    private boolean nicCupplC;

    public void setHorizontalPositionAvailable(boolean horizontalPositionAvailable) {
        this.horizontalPositionAvailable = horizontalPositionAvailable;
    }

    public void setMovement(byte movement) {
        this.movement = movement;
    }

    public void setHeadingstatus(boolean headingstatus) {
        this.headingstatus = headingstatus;
    }

    public void setGroundTrack(byte groundTrack) {
        this.groundTrack = groundTrack;
    }

    public void setTimeFlag(boolean timeFlag) {
        this.timeFlag = timeFlag;
    }

    public void setCprFormat(boolean cprFormat) {
        this.cprFormat = cprFormat;
    }

    public void setCprEncodedLat(int cprEncodedLat) {
        this.cprEncodedLat = cprEncodedLat;
    }

    public void setCprEncodedLon(int cprEncodedLon) {
        this.cprEncodedLon = cprEncodedLon;
    }

    public void setNicSupplA(boolean nicSupplA) {
        this.nicSupplA = nicSupplA;
    }

    public void setNicCupplC(boolean nicCupplC) {
        this.nicCupplC = nicCupplC;
    }

    public boolean isHorizontalPositionAvailable() {
        return horizontalPositionAvailable;
    }

    public byte getMovement() {
        return movement;
    }

    public boolean isHeadingstatus() {
        return headingstatus;
    }

    public byte getGroundTrack() {
        return groundTrack;
    }

    public boolean isTimeFlag() {
        return timeFlag;
    }

    public boolean isCprFormat() {
        return cprFormat;
    }

    public int getCprEncodedLat() {
        return cprEncodedLat;
    }

    public int getCprEncodedLon() {
        return cprEncodedLon;
    }

    public boolean isNicSupplA() {
        return nicSupplA;
    }

    public boolean isNicCupplC() {
        return nicCupplC;
    }
}
