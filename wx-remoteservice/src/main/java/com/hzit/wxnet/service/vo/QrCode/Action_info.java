package com.hzit.wxnet.service.vo.QrCode;

import java.io.Serializable;

public class Action_info implements Serializable {
    private Scene scene;
    public void setScene(Scene scene) {
        this.scene = scene;
    }
    public Scene getScene() {
        return scene;
    }

    @Override
    public String toString() {
        return "Action_info{" +
                "scene=" + scene +
                '}';
    }
}
