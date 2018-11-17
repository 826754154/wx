package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.base.BaseMediaMessage;

public class VideoMessage extends BaseMediaMessage {

    protected String thumbMediaId;

    @Override
    protected String initType() {
        return "video";
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    @Override
    public String toString() {
        return "VideoMessage{" +
                "thumbMediaId='" + thumbMediaId + '\'' +
                ", mediaId='" + mediaId + '\'' +
                ", msgId=" + msgId +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
