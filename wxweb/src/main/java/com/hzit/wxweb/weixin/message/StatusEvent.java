package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.base.BaseEventMessage;

public class StatusEvent extends BaseEventMessage {

    private String status;


    protected long msgId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }

    @Override
    public String toString() {
        return "StatusEvent{" +
                "status='" + status + '\'' +
                ", msgId=" + msgId +
                ", event='" + event + '\'' +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
