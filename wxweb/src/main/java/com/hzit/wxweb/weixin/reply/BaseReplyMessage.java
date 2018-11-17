package com.hzit.wxweb.weixin.reply;


import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;


public class BaseReplyMessage implements MessageTypeInitialize,Serializable {

    @JSONField(name="ToUserName")
    protected String toUserName;
    @JSONField(name="FromUserName")
    protected String fromUserName;
    @JSONField(name="CreateTime")
    protected long createTime = System.currentTimeMillis();
    @JSONField(name="MsgType")
    protected String msgType = initType();

    @Override
    public String initType() {
        return null;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
}
