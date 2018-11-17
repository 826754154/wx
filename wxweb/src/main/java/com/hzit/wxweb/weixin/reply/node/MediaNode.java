package com.hzit.wxweb.weixin.reply.node;


import java.io.Serializable;

public class MediaNode implements Serializable {

    private String mediaId;

    public MediaNode(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
}
