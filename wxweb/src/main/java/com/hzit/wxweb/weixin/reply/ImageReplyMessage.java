package com.hzit.wxweb.weixin.reply;


import com.hzit.wxweb.weixin.reply.node.MediaNode;

public class ImageReplyMessage extends BaseReplyMessage {


    private MediaNode image;

    public MediaNode getImage() {
        return image;
    }

    public void setImage(MediaNode image) {
        this.image = image;
    }

    @Override
    public String initType() {
        return "image";
    }
}
