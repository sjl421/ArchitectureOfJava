package com.github.thushear.msf.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kongming on 2016/10/28.
 */
public final class MessageHeader {

    private int magicCode = 0xabcd0101;

    private int length;//消息长度

    private long   sessionId;//会话id

    private byte type;//消息类型

    private byte priority;//消息优先级

    private Map<String,Object> attachment = new HashMap<>();//附件

    public int getMagicCode() {
        return magicCode;
    }

    public void setMagicCode(int magicCode) {
        this.magicCode = magicCode;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getPriority() {
        return priority;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    public Map<String, Object> getAttachment() {
        return attachment;
    }

    public void setAttachment(Map<String, Object> attachment) {
        this.attachment = attachment;
    }


    @Override
    public String toString() {
        return "MessageHeader{" +
                "attachment=" + attachment +
                ", priority=" + priority +
                ", type=" + type +
                ", sessionId=" + sessionId +
                ", length=" + length +
                ", magicCode=" + magicCode +
                '}';
    }
}
