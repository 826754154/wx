package com.hzit.wxweb.weixin.message.node;



import java.io.Serializable;

public class ScanCodeInfo implements Serializable {


    private String scanType;


    private String scanResult;

    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public String getScanResult() {
        return scanResult;
    }

    public void setScanResult(String scanResult) {
        this.scanResult = scanResult;
    }
}