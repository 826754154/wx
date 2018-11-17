package com.hzit.wxnet.service.vo.textMessage;

import java.io.Serializable;

public class Text implements Serializable {
    private String content;

     public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
