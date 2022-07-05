package org.opensky.model;

public class TargetStateAndStatusMsgData extends AdsbTrackData{
    private boolean silSuppl;
    private boolean selectedAltitudeType;
    private int selected_altitude;
    private int barometricPressureSetting;
    private boolean selectectedHeadingStatus;
    private boolean selectectedHeadingSign;
    private int selectedHeading;
    private byte nacP;
    private boolean nicBaro;
    private byte sil;
    private boolean mcpFcuStatus;
    private boolean autopilotEngaged;
    private boolean vnavModeEngaged;
    private boolean altitudeHoldMode;
    private boolean approachMode;
    private boolean hasOperationalTcas;
    private boolean lnavModeEngaged;

    public void setSilSuppl(boolean silSuppl) {
        this.silSuppl = silSuppl;
    }

    public void setSelectedAltitudeType(boolean selectedAltitudeType) {
        this.selectedAltitudeType = selectedAltitudeType;
    }

    public void setSelected_altitude(int selected_altitude) {
        this.selected_altitude = selected_altitude;
    }

    public void setBarometricPressureSetting(int barometricPressureSetting) {
        this.barometricPressureSetting = barometricPressureSetting;
    }

    public void setSelectectedHeadingStatus(boolean selectectedHeadingStatus) {
        this.selectectedHeadingStatus = selectectedHeadingStatus;
    }

    public void setSelectectedHeadingSign(boolean selectectedHeadingSign) {
        this.selectectedHeadingSign = selectectedHeadingSign;
    }

    public void setSelectedHeading(int selectedHeading) {
        this.selectedHeading = selectedHeading;
    }

    public void setNacP(byte nacP) {
        this.nacP = nacP;
    }

    public void setNicBaro(boolean nicBaro) {
        this.nicBaro = nicBaro;
    }

    public void setSil(byte sil) {
        this.sil = sil;
    }

    public void setMcpFcuStatus(boolean mcpFcuStatus) {
        this.mcpFcuStatus = mcpFcuStatus;
    }

    public void setAutopilotEngaged(boolean autopilotEngaged) {
        this.autopilotEngaged = autopilotEngaged;
    }

    public void setVnavModeEngaged(boolean vnavModeEngaged) {
        this.vnavModeEngaged = vnavModeEngaged;
    }

    public void setAltitudeHoldMode(boolean altitudeHoldMode) {
        this.altitudeHoldMode = altitudeHoldMode;
    }

    public void setApproachMode(boolean approachMode) {
        this.approachMode = approachMode;
    }

    public void setHasOperationalTcas(boolean hasOperationalTcas) {
        this.hasOperationalTcas = hasOperationalTcas;
    }

    public void setLnavModeEngaged(boolean lnavModeEngaged) {
        this.lnavModeEngaged = lnavModeEngaged;
    }

    public boolean isSilSuppl() {
        return silSuppl;
    }

    public boolean isSelectedAltitudeType() {
        return selectedAltitudeType;
    }

    public int getSelected_altitude() {
        return selected_altitude;
    }

    public int getBarometricPressureSetting() {
        return barometricPressureSetting;
    }

    public boolean isSelectectedHeadingStatus() {
        return selectectedHeadingStatus;
    }

    public boolean isSelectectedHeadingSign() {
        return selectectedHeadingSign;
    }

    public int getSelectedHeading() {
        return selectedHeading;
    }

    public byte getNacP() {
        return nacP;
    }

    public boolean isNicBaro() {
        return nicBaro;
    }

    public byte getSil() {
        return sil;
    }

    public boolean isMcpFcuStatus() {
        return mcpFcuStatus;
    }

    public boolean isAutopilotEngaged() {
        return autopilotEngaged;
    }

    public boolean isVnavModeEngaged() {
        return vnavModeEngaged;
    }

    public boolean isAltitudeHoldMode() {
        return altitudeHoldMode;
    }

    public boolean isApproachMode() {
        return approachMode;
    }

    public boolean isHasOperationalTcas() {
        return hasOperationalTcas;
    }

    public boolean isLnavModeEngaged() {
        return lnavModeEngaged;
    }
}
