package com.hzit.wxweb.weixin.message.base;


public abstract class BaseMsgMessage extends BaseMessage{


    protected long msgId;

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }

    @Override
    public String toString() {
        return "BaseMsgMessage{" +
                "msgId=" + msgId +
                '}';
    }
}
