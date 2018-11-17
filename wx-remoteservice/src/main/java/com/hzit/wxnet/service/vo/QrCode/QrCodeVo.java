package com.hzit.wxnet.service.vo.QrCode;

import java.io.Serializable;

public class QrCodeVo implements Serializable {
    private long expire_seconds;
    private String action_name;
    private Action_info action_info;
    public void setExpire_seconds(long expire_seconds) {
        this.expire_seconds = expire_seconds;
    }
    public long getExpire_seconds() {
        return expire_seconds;
    }

    public void setAction_name(String action_name) {
        this.action_name = action_name;
    }
    public String getAction_name() {
        return action_name;
    }

    public void setAction_info(Action_info action_info) {
        this.action_info = action_info;
    }
    public Action_info getAction_info() {
        return action_info;
    }

    public void setSenceStr(String senceStr){
        this.action_info = new Action_info();
        Scene scene = new Scene();
        scene.setScene_str(senceStr);
        action_info.setScene(scene);
    }

    @Override
    public String toString() {
        return "QrCodeVo{" +
                "expire_seconds=" + expire_seconds +
                ", action_name='" + action_name + '\'' +
                ", action_info=" + action_info +
                '}';
    }
}
