package com.hzit.wxweb.weixin.reply;



public class CustomerReplyMessage extends BaseReplyMessage {


    private String transInfo;

    @Override
    public String initType() {
        return "transfer_customer_service";
    }

    public String getTransInfo() {
        return transInfo;
    }

    public void setTransInfo(String transInfo) {
        this.transInfo = transInfo;
    }
}
