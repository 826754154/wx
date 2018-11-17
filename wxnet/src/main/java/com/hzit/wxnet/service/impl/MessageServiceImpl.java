package com.hzit.wxnet.service.impl;

import com.alibaba.fastjson.JSON;
import com.hzit.wxnet.service.AccessTokenService;
import com.hzit.wxnet.service.MessageService;
import com.hzit.wxnet.tools.NetTool;
import com.hzit.wxnet.service.vo.MessageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private AccessTokenService accessTokenService;


    @Override
    public String sendMsg(MessageVo messageVo) {
        String accessToken = accessTokenService.getAccessToken();
        String url="https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token="+accessToken;
        if (messageVo.getMsgtype().equals("text")){
            System.out.println("正在发送文本消息");
        }else if (messageVo.getMsgtype().equals("news")){
            System.out.println("正在发送图文消息");
        }

        String jsonString = JSON.toJSONString(messageVo);
        System.out.println("发送的JSON字符串："+jsonString);
        String responseText = NetTool.post(url, jsonString);
        return responseText;
    }
}
