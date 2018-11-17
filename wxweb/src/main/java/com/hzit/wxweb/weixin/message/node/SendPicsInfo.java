package com.hzit.wxweb.weixin.message.node;



import java.io.Serializable;

public class SendPicsInfo implements Serializable {

    private int count;


    private PicList picList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public PicList getPicList() {
        return picList;
    }

    public void setPicList(PicList picList) {
        this.picList = picList;
    }
}

