package com.hzit.wxnet.service.vo.textMessage;

import com.hzit.wxnet.service.vo.MessageVo;

import java.io.Serializable;

public class TextMessageVo extends MessageVo implements Serializable {
    private Text text;

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
}
