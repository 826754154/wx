package com.hzit.wxweb.weixin.reply;


import com.hzit.wxweb.weixin.reply.node.MediaNode;

public class VoiceReplyMessage extends BaseReplyMessage {

    protected MediaNode voice;

    @Override
    public String initType() {
        return "voice";
    }

    public MediaNode getVoice() {
        return voice;
    }

    public void setVoice(MediaNode voice) {
        this.voice = voice;
    }
}
