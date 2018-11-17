package com.hzit.wxnet.service.vo.openid;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {


    private List<String> openid;

    public void setOpenid(List<String> openid) {
        this.openid = openid;
    }

    public List<String> getOpenid() {
        return openid;
    }


    @Override
    public String toString() {
        return "Data{" +
                "openid=" + openid +
                '}';
    }
}
