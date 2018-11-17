package com.hzit.wxweb.controller;


import com.hzit.wxweb.Service.WxService;
import com.hzit.wxweb.Util.Convert;
import com.hzit.wxweb.Util.Sha1;
import com.hzit.wxweb.weixin.message.base.BaseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
public class WeChatController {

    @Autowired
    private WxService wxService;
    @Value("${token}")
    private String token;

    @RequestMapping(value = "wx",method = RequestMethod.GET)
    @ResponseBody
    public Object test(@RequestParam("signature") String signature,
                       @RequestParam("timestamp") String timestamp,
                       @RequestParam("nonce") String nonce,
                       @RequestParam("echostr") String echostr){

        boolean checkurl = checkurl(timestamp, nonce, signature);
        if (checkurl){
            System.out.println("接入成功");
            return echostr;
        } else {
            System.out.println("接入失败");
            return "";
        }
    }

    @RequestMapping(value = "wx",method = RequestMethod.POST)
    @ResponseBody
    public Object doing(@RequestParam("signature") String signature,
                       @RequestParam("timestamp") String timestamp,
                       @RequestParam("nonce") String nonce,
                        @RequestBody String xml){
        BaseMessage msg=null;
        boolean checkurl = checkurl(timestamp, nonce, signature);
        if (checkurl){
            String jsonstr = Convert.xmlToJson(xml);//XML转化成json
            System.out.println("接收的xml"+xml);
            //调用业务逻辑实现业务功能，实现完业务功能后返回一个XML格式，这个XML就是返回给用户的消息
            String replyXml = "<xml>"+wxService.doingService(jsonstr)+"</xml>";
            System.out.println("回复的XML"+replyXml);
            return replyXml;
        } else {
            System.out.println("接口收到异常请求");
            return "";
        }
    }



    private boolean checkurl(String timestamp,String nonce,String signature){
        String n[]={timestamp,nonce,token};
        Arrays.sort(n);  //字典排序
        String p=n[0]+n[1]+n[2];
        String encode = Sha1.encode(p);
        if(encode.equals(signature)){
            return true;
        } else{
            return false;
        }
    }
}
