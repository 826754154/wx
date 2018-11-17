package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.base.BaseMediaMessage;

public class VoiceMessage extends BaseMediaMessage {

    protected String format;

    protected String recognition;

    @Override
    protected String initType() {
        return "voice";
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }

    @Override
    public String toString() {
        return "VoiceMessage{" +
                "recognition='" + recognition + '\'' +
                ", mediaId='" + mediaId + '\'' +
                ", msgId=" + msgId +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
