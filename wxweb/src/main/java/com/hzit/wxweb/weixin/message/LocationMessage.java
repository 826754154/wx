package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.base.BaseMediaMessage;

public class LocationMessage extends BaseMediaMessage {


    protected float locationX;


    protected float locationY;

    protected int scale;


    protected String label;

    @Override
    protected String initType() {
        return "location";
    }

    public float getLocationX() {
        return locationX;
    }

    public void setLocationX(float locationX) {
        this.locationX = locationX;
    }

    public float getLocationY() {
        return locationY;
    }

    public void setLocationY(float locationY) {
        this.locationY = locationY;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "LocationMessage{" +
                "locationX=" + locationX +
                ", locationY=" + locationY +
                ", scale=" + scale +
                ", label='" + label + '\'' +
                ", mediaId='" + mediaId + '\'' +
                ", msgId=" + msgId +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
