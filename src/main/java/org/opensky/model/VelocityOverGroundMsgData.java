package org.opensky.model;

public class VelocityOverGroundMsgData extends AdsbTrackData{
    private byte msgSubtype;
    private boolean intentChange;
    private boolean ifrCapability;
    private byte navigationAccuracyCategory;
    private boolean directionWest; // 0 = east, 1 = west
    private short eastWestVelocity; // in kn
    private boolean velocityInfoAvailable;
    private boolean directionSouth; // 0 = north, 1 = south
    private short northSouthVelocity; // in kn
    private boolean verticalSource; // 0 = geometric, 1 = barometric
    private boolean verticalRateDown; // 0 = up, 1 = down
    private short verticalRate; // in ft/min
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

    public void setDirectionWest(boolean directionWest) {
        this.directionWest = directionWest;
    }

    public void setEastWestVelocity(short eastWestVelocity) {
        this.eastWestVelocity = eastWestVelocity;
    }

    public void setVelocityInfoAvailable(boolean velocityInfoAvailable) {
        this.velocityInfoAvailable = velocityInfoAvailable;
    }

    public void setDirectionSouth(boolean directionSouth) {
        this.directionSouth = directionSouth;
    }

    public void setNorthSouthVelocity(short northSouthVelocity) {
        this.northSouthVelocity = northSouthVelocity;
    }

    public void setVerticalSource(boolean verticalSource) {
        this.verticalSource = verticalSource;
    }

    public void setVerticalRateDown(boolean verticalRateDown) {
        this.verticalRateDown = verticalRateDown;
    }

    public void setVerticalRate(short verticalRate) {
        this.verticalRate = verticalRate;
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

    public boolean isDirectionWest() {
        return directionWest;
    }

    public short getEastWestVelocity() {
        return eastWestVelocity;
    }

    public boolean isVelocityInfoAvailable() {
        return velocityInfoAvailable;
    }

    public boolean isDirectionSouth() {
        return directionSouth;
    }

    public short getNorthSouthVelocity() {
        return northSouthVelocity;
    }

    public boolean isVerticalSource() {
        return verticalSource;
    }

    public boolean isVerticalRateDown() {
        return verticalRateDown;
    }

    public short getVerticalRate() {
        return verticalRate;
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
