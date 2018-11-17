package com.hzit.wxnet.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hzit.wxnet.service.AccessTokenService;
import com.hzit.wxnet.tools.NetTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class AccessTokenServiceImpl implements AccessTokenService {

    @Value("${wx.appID}")
    private  String appID;

    @Value("${wx.appsecret}")
    private  String appsecret;



    @Autowired
    private StringRedisTemplate stringRedisTemplate;



    @Override
    public String getAccessToken() {
        String url="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appID+"&secret="+appsecret;
        String accessToken = stringRedisTemplate.opsForValue().get("access_token");
        if (accessToken==null){
            String responseText = NetTool.get(url);
            JSONObject json = JSON.parseObject(responseText);
            if (json.containsKey("access_token")){
                String a=json.getString("access_token");
                stringRedisTemplate.opsForValue().set("access_token",a,7200,TimeUnit.SECONDS);
                return a;
            }else{
                return null;
            }
        }else{
            return accessToken;
        }
    }
}
