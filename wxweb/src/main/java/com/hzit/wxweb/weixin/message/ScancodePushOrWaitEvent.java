package com.hzit.wxweb.weixin.message;


import com.hzit.wxweb.weixin.message.node.ScanCodeInfo;

public class ScancodePushOrWaitEvent extends MenuEvent {

    private ScanCodeInfo scanCodeInfo;

    public ScanCodeInfo getScanCodeInfo() {
        return scanCodeInfo;
    }

    public void setScanCodeInfo(ScanCodeInfo scanCodeInfo) {
        this.scanCodeInfo = scanCodeInfo;
    }

    @Override
    public String toString() {
        return "ScancodePushOrWaitEvent{" +
                "scanCodeInfo=" + scanCodeInfo +
                ", eventKey='" + eventKey + '\'' +
                ", event='" + event + '\'' +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}

