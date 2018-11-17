package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.base.BaseEventMessage;

public class MenuEvent extends BaseEventMessage {


    protected String eventKey;

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    @Override
    public String toString() {
        return "MenuEvent{" +
                "eventKey='" + eventKey + '\'' +
                ", event='" + event + '\'' +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
