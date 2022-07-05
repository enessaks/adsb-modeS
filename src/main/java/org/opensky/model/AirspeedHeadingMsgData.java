package org.opensky.model;

public class AirspeedHeadingMsgData extends AdsbTrackData {
    private byte msgSubtype;
    private boolean intentChange;
    private boolean ifrCapability;
    private byte navigationAccuracyCategory;
    private boolean headingStatusBit;
    private double heading; // in degrees
    private boolean trueAirspeed; // 0 = indicated AS, 1 = true AS
    private short airspeed; // in knots
    private boolean airspeed_available;
    private boolean verticalSource; // 0 = geometric, 1 = barometric
    private boolean verticalRateDown; // 0 = up, 1 = down
    private short vertical_rate; // in ft/s
    private boolean verticalRateInfoAvailable;
    private int geoMinusBaro; // in ft
    private boolean geoMinusBaroAvailable;

    public void setMsgSubtype(byte msgSubtype) {
        this.msgSubtype = msgSubtype;
    }

    public void setIntentChange(boolean intentChange) {
        this.intentChange = intentChange;
    }

    public void setIfrCapability(boolean ifrCapability) {
        this.ifrCapability = ifrCapability;
    }

    public void setNavigationAccuracyCategory(byte navigationAccuracyCategory) {
        this.navigationAccuracyCategory = navigationAccuracyCategory;
    }

    public void setHeadingStatusBit(boolean headingStatusBit) {
        this.headingStatusBit = headingStatusBit;
    }

    public void setHeading(double heading) {
        this.heading = heading;
    }

    public void setTrueAirspeed(boolean trueAirspeed) {
        this.trueAirspeed = trueAirspeed;
    }

    public void setAirspeed(short airspeed) {
        this.airspeed = airspeed;
    }

    public void setAirspeed_available(boolean airspeed_available) {
        this.airspeed_available = airspeed_available;
    }

    public void setVerticalSource(boolean verticalSource) {
        this.verticalSource = verticalSource;
    }

    public void setVerticalRateDown(boolean verticalRateDown) {
        this.verticalRateDown = verticalRateDown;
    }

    public void setVertical_rate(short vertical_rate) {
        this.vertical_rate = vertical_rate;
    }

    public void setVerticalRateInfoAvailable(boolean verticalRateInfoAvailable) {
        this.verticalRateInfoAvailable = verticalRateInfoAvailable;
    }

    public void setGeoMinusBaro(int geoMinusBaro) {
        this.geoMinusBaro = geoMinusBaro;
    }

    public void setGeoMinusBaroAvailable(boolean geoMinusBaroAvailable) {
        this.geoMinusBaroAvailable = geoMinusBaroAvailable;
    }

    public byte getMsgSubtype() {
        return msgSubtype;
    }

    public boolean isIntentChange() {
        return intentChange;
    }

    public boolean isIfrCapability() {
        return ifrCapability;
    }

    public byte getNavigationAccuracyCategory() {
        return navigationAccuracyCategory;
    }

    public boolean isHeadingStatusBit() {
        return headingStatusBit;
    }

    public double getHeading() {
        return heading;
    }

    public boolean isTrueAirspeed() {
        return trueAirspeed;
    }

    public short getAirspeed() {
        return airspeed;
    }

    public boolean isAirspeed_available() {
        return airspeed_available;
    }

    public boolean isVerticalSource() {
        return verticalSource;
    }

    public boolean isVerticalRateDown() {
        return verticalRateDown;
    }

    public short getVertical_rate() {
        return vertical_rate;
    }

    public boolean isVerticalRateInfoAvailable() {
        return verticalRateInfoAvailable;
    }

    public int getGeoMinusBaro() {
        return geoMinusBaro;
    }

    public boolean isGeoMinusBaroAvailable() {
        return geoMinusBaroAvailable;
    }
}
