package com.hzit.wxnet.service.vo.QrCode;

import java.io.Serializable;

public class QrCodeResponse implements Serializable {
    private String ticket;
    private int expire_seconds;
    private String url;
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    public String getTicket() {
        return ticket;
    }

    public void setExpire_seconds(int expire_seconds) {
        this.expire_seconds = expire_seconds;
    }
    public int getExpire_seconds() {
        return expire_seconds;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "QrCodeResponse{" +
                "ticket='" + ticket + '\'' +
                ", expire_seconds=" + expire_seconds +
                ", url='" + url + '\'' +
                '}';
    }
}
