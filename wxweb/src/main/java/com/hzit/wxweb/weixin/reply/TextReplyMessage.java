package com.hzit.wxweb.weixin.reply;


import com.alibaba.fastjson.annotation.JSONField;

public class TextReplyMessage extends BaseReplyMessage{

@JSONField(name = "Content")
    protected String content;

    @Override
    public String initType() {
        return "text";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
