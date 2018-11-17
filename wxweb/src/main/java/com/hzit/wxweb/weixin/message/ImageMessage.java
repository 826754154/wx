package com.hzit.wxweb.weixin.message;


import com.alibaba.fastjson.annotation.JSONField;
import com.hzit.wxweb.weixin.message.base.BaseMediaMessage;

public class ImageMessage extends BaseMediaMessage {


    protected String picUrl;

    @Override
    protected String initType() {
        return "image";
    }
    @JSONField(name = "PicUrl")
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public String toString() {
        return "ImageMessage{" +
                "picUrl='" + picUrl + '\'' +
                ", mediaId='" + mediaId + '\'' +
                ", msgId=" + msgId +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
