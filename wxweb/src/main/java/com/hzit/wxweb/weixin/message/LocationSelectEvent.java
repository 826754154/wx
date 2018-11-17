package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.node.SendLocationInfo;

public class LocationSelectEvent extends MenuEvent {


    private SendLocationInfo sendLocationInfo;

    public SendLocationInfo getSendLocationInfo() {
        return sendLocationInfo;
    }

    public void setSendLocationInfo(SendLocationInfo sendLocationInfo) {
        this.sendLocationInfo = sendLocationInfo;
    }

    @Override
    public String toString() {
        return "LocationSelectEvent{" +
                "sendLocationInfo=" + sendLocationInfo +
                ", eventKey='" + eventKey + '\'' +
                ", event='" + event + '\'' +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
