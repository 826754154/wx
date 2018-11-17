package com.hzit.wxweb.weixin.reply;


import com.hzit.wxweb.weixin.reply.node.VideoMediaNode;

public class VideoReplyMessage extends BaseReplyMessage {

    protected VideoMediaNode video;

    @Override
    public String initType() {
        return "video";
    }

    public VideoMediaNode getVideo() {
        return video;
    }

    public void setVideo(VideoMediaNode video) {
        this.video = video;
    }
}
