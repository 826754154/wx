package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.base.BaseMsgMessage;

public class TextMessage extends BaseMsgMessage {

    protected String content;

    @Override
    protected String initType() {
        return "text";
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "content='" + content + '\'' +
                ", msgId=" + msgId +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
