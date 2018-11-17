package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.base.BaseEventMessage;

public class LocationEvent extends BaseEventMessage {


    protected float latitude;


    protected float longitude;


    protected float precision;

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getPrecision() {
        return precision;
    }

    public void setPrecision(float precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return "LocationEvent{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", precision=" + precision +
                ", event='" + event + '\'' +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
