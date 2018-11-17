package com.hzit.wxnet.service.vo;


import java.io.Serializable;

public abstract class MessageVo implements Serializable {
    private String touser;
    private String msgtype;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgType(String msgtype) {
        this.msgtype = msgtype;
    }
    public void setTextContent(String content){

    }
}
