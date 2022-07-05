package org.opensky.model;

public class AirbornePositionMsgData extends AdsbTrackData{
    private boolean horizontalPositionAvailable;
    private boolean altitudeAvailable;
    private byte surveillanceStatus;
    private boolean nicSupplA;
    private boolean nicSupplB;
    private short altitudeEncoded;
    private boolean timeFlag;
    private boolean cprFormat;
    private int cprEncodedLat;
    private int cprEncodedLon;

    public void setHorizontalPositionAvailable(boolean horizontalPositionAvailable) {
        this.horizontalPositionAvailable = horizontalPositionAvailable;
    }

    public void setAltitudeAvailable(boolean altitudeAvailable) {
        this.altitudeAvailable = altitudeAvailable;
    }

    public void setSurveillanceStatus(byte surveillanceStatus) {
        this.surveillanceStatus = surveillanceStatus;
    }

    public void setNicSupplA(boolean nicSupplA) {
        this.nicSupplA = nicSupplA;
    }

    public void setNicSupplB(boolean nicSupplB) {
        this.nicSupplB = nicSupplB;
    }

    public void setAltitudeEncoded(short altitudeEncoded) {
        this.altitudeEncoded = altitudeEncoded;
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

    public boolean isHorizontalPositionAvailable() {
        return horizontalPositionAvailable;
    }

    public boolean isAltitudeAvailable() {
        return altitudeAvailable;
    }

    public byte getSurveillanceStatus() {
        return surveillanceStatus;
    }

    public boolean isNicSupplA() {
        return nicSupplA;
    }

    public boolean isNicSupplB() {
        return nicSupplB;
    }

    public short getAltitudeEncoded() {
        return altitudeEncoded;
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
}
