package com.hzit.wxweb.weixin.reply.node;



public class VideoMediaNode extends MediaNode {

    private String title;

    private String description;

    VideoMediaNode(String mediaId, String title, String description) {
        super(mediaId);
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
