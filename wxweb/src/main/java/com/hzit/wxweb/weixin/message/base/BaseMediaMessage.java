package com.hzit.wxweb.weixin.message.base;


import com.alibaba.fastjson.annotation.JSONField;

public abstract class BaseMediaMessage extends BaseMsgMessage {


    protected String mediaId;
    @JSONField(name = "MediaId")
    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
}
