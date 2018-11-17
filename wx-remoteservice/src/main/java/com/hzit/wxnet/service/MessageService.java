package com.hzit.wxnet.service;


import com.hzit.wxnet.service.vo.MessageVo;

public interface MessageService {
    /**
     * 发送所有类型的消息
     * @param messageVo
     * @return
     */
    String sendMsg(MessageVo messageVo);

}
