package com.hzit.wxweb.weixin.reply;


import com.hzit.wxweb.weixin.reply.node.MusicNode;

public class MusicReplyMessage extends BaseReplyMessage {


    private MusicNode music;

    @Override
    public String initType() {
        return "music";
    }

    public MusicNode getMusic() {
        return music;
    }

    public void setMusic(MusicNode music) {
        this.music = music;
    }
}
