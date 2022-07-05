package org.opensky.model;

public class AllCallReplyData extends AdsbTrackData{
    private byte capabilities;
    private byte[] parityInterrogator; // 3 bytes
    private byte codeLabel;

    public void setCapabilities(byte capabilities) {
        this.capabilities = capabilities;
    }

    public void setParityInterrogator(byte[] parityInterrogator) {
        this.parityInterrogator = parityInterrogator;
    }

    public void setCodeLabel(byte codeLabel) {
        this.codeLabel = codeLabel;
    }

    public byte getCapabilities() {
        return capabilities;
    }

    public byte[] getParityInterrogator() {
        return parityInterrogator;
    }

    public byte getCodeLabel() {
        return codeLabel;
    }
}
