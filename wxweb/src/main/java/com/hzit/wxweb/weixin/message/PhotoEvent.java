package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.base.BaseEventMessage;
import com.hzit.wxweb.weixin.message.node.SendPicsInfo;

public class PhotoEvent extends BaseEventMessage {

    private SendPicsInfo sendPicsInfo;

    public SendPicsInfo getSendPicsInfo() {
        return sendPicsInfo;
    }

    public void setSendPicsInfo(SendPicsInfo sendPicsInfo) {
        this.sendPicsInfo = sendPicsInfo;
    }

    @Override
    public String toString() {
        return "PhotoEvent{" +
                "sendPicsInfo=" + sendPicsInfo +
                ", event='" + event + '\'' +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}

