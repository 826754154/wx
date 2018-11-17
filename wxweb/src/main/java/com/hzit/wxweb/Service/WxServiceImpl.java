package com.hzit.wxweb.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hzit.wxnet.service.WxUserinfoService;
import com.hzit.wxweb.Util.Convert;
import com.hzit.wxweb.Util.JiandaoShitouBu;
import com.hzit.wxweb.weixin.message.*;
import com.hzit.wxweb.weixin.message.base.BaseMessage;
import com.hzit.wxweb.weixin.reply.BaseReplyMessage;
import com.hzit.wxweb.weixin.reply.NewsReplyMessage;
import com.hzit.wxweb.weixin.reply.TextReplyMessage;
import com.hzit.wxweb.weixin.reply.node.NewsItem;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class WxServiceImpl implements WxService {


    @Autowired
    private AmqpTemplate amqpTemplate;


    @Override
    public String doingService(String jsonstr) {
        JSONObject jsonObject = JSON.parseObject(jsonstr).getJSONObject("xml");
        //判断根据不同的消息类型做不同的功能操作
        String msgType = jsonObject.getString("MsgType");
        BaseMessage msg=null; //这是用户发送过来的
        BaseReplyMessage replyMessage=null;//准备处理完后回复给用户的信息
        switch (msgType){
            case "text":
                msg= JSON.parseObject(jsonObject.toJSONString(),TextMessage.class);
                replyMessage=new TextReplyMessage();
                ((TextReplyMessage)replyMessage).setContent("听说你发来消息给我");
                replyMessage.setFromUserName(msg.getToUserName());
                replyMessage.setToUserName(msg.getFromUserName());
                replyMessage.setCreateTime(System.currentTimeMillis());
                break;
            case "image":
                msg= JSON.parseObject(jsonObject.toJSONString(),ImageMessage.class);
                break;
            case "voice":
                msg= JSON.parseObject(jsonObject.toJSONString(),VoiceMessage.class);
                break;
            case "video":
                msg= JSON.parseObject(jsonObject.toJSONString(),VideoMessage.class);
                break;
            case "location":
                msg= JSON.parseObject(jsonObject.toJSONString(),LocationMessage.class);
                break;
            case "link":
                msg= JSON.parseObject(jsonObject.toJSONString(),LinkMessage.class);
                break;
            case "event":
                String event = jsonObject.getString("Event");
                switch (event){
                    case "unsubscribe":
                        amqpTemplate.convertAndSend("zhangwentao_unsub",jsonObject);
                        replyMessage=new TextReplyMessage();
                        break;
                    case "SCAN":
                    case "subscribe":
                        msg= JSON.parseObject(jsonObject.toJSONString(),MenuEvent.class);
                        amqpTemplate.convertAndSend("zhangwentao_sub",jsonObject);
                        replyMessage=new TextReplyMessage();
                        ((TextReplyMessage)replyMessage).setContent("感谢你的关注");
                        replyMessage.setFromUserName(msg.getToUserName());
                        replyMessage.setToUserName(msg.getFromUserName());
                        replyMessage.setCreateTime(System.currentTimeMillis());
                        break;
                    case "location"://上报地理位置事件
                        break;
                    case "CLICK"://点击菜单拉取消息时的事件推送
                        msg= JSON.parseObject(jsonObject.toJSONString(),MenuEvent.class);
                           replyMessage=new NewsReplyMessage();
                        List<String> responseList = JiandaoShitouBu.test(((MenuEvent) msg).getEventKey());
                        ((NewsReplyMessage)replyMessage).setArticleCount(1);
                        NewsItem item = new NewsItem("剪刀石头布", responseList.get(0), responseList.get(1), "http://www.4399.com");
                        ((NewsReplyMessage) replyMessage).addNewsItem(item);
                        replyMessage.setFromUserName(msg.getToUserName());
                        replyMessage.setToUserName(msg.getFromUserName());
                        replyMessage.setCreateTime(System.currentTimeMillis());
                        break;
                    case "view": //点击菜单跳转链接时的事件推送
                        break;
                }
                break;
        }
        //返回一个XML格式，作为回复信息
        String s=JSON.toJSONString(replyMessage);
        String replyXml = Convert.jsonToXml(s);
        return replyXml;
    }
}
