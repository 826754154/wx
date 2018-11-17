package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.base.BaseEventMessage;

public class TicketEvent extends BaseEventMessage {

    protected String eventKey;

    protected String ticket;

    protected boolean isFirstSubscribe;

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public boolean getIsFirstSubscribe() {
        return isFirstSubscribe;
    }

    public void setIsFirstSubscribe(boolean isFirstSubscribe) {
        this.isFirstSubscribe = isFirstSubscribe;
    }

    @Override
    public String toString() {
        return "TicketEvent{" +
                "eventKey='" + eventKey + '\'' +
                ", ticket='" + ticket + '\'' +
                ", isFirstSubscribe=" + isFirstSubscribe +
                ", event='" + event + '\'' +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
