package com.hzit.wxnet.service.vo.QrCode;

import java.io.Serializable;

public class Scene implements Serializable {
    private String scene_str;
    public void setScene_str(String scene_str) {
        this.scene_str = scene_str;
    }
    public String getScene_str() {
        return scene_str;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "scene_str='" + scene_str + '\'' +
                '}';
    }
}
