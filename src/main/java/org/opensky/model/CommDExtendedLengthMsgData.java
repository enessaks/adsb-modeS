package org.opensky.model;

public class CommDExtendedLengthMsgData extends AdsbTrackData{
    private byte[] message;
    private boolean ack;
    private byte seqno;

    public void setMessage(byte[] message) {
        this.message = message;
    }

    public void setAck(boolean ack) {
        this.ack = ack;
    }

    public void setSeqno(byte seqno) {
        this.seqno = seqno;
    }

    public byte[] getMessage() {
        return message;
    }

    public boolean isAck() {
        return ack;
    }

    public byte getSeqno() {
        return seqno;
    }
}
