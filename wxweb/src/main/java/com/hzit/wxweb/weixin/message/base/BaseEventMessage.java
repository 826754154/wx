package com.hzit.wxweb.weixin.message.base;


import com.alibaba.fastjson.annotation.JSONField;

public abstract class BaseEventMessage extends BaseMessage {


    protected String event;

    @Override
    protected String initType() {
        return "event";
    }
    @JSONField(name = "Event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
