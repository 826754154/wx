package com.hzit.wxnet.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hzit.wxnet.service.AccessTokenService;
import com.hzit.wxnet.service.QrcodeService;
import com.hzit.wxnet.tools.NetTool;
import com.hzit.wxnet.service.vo.QrCode.QrCodeResponse;
import com.hzit.wxnet.service.vo.QrCode.QrCodeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class QrcodeServiceImpl implements QrcodeService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private AccessTokenService accessTokenService;


    @Override
    public QrCodeResponse createLimitQrcode() {
        QrCodeVo vo = new QrCodeVo();
        vo.setAction_name(QR_LIMIT_SCENE);
        Long num = stringRedisTemplate.boundValueOps("num").increment(1);

        vo.setSenceStr("永久二维码"+num);
        String url="https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+accessTokenService.getAccessToken();
        String jsonString = JSON.toJSONString(vo);
        System.out.println(vo);
        String responseText = NetTool.post(url, jsonString);
        System.out.println("jsonString-------"+jsonString);
        JSONObject jsonObject = JSON.parseObject(responseText);
        System.out.println("responseText---------"+responseText);
        if (jsonObject.containsKey("errcode")){
            System.out.println("创建失败");
            return null;
        }else{
            QrCodeResponse qrCodeResponse = JSON.parseObject(responseText, QrCodeResponse.class);
            System.out.println("qrCodeResponse-----------"+qrCodeResponse);
            return qrCodeResponse;
        }
    }

    @Override
    public QrCodeResponse createTempQrcode(int limitTime) {
        QrCodeVo vo = new QrCodeVo();
        vo.setAction_name(QR_STR_SCENE);
        vo.setExpire_seconds(limitTime);
        Long num = stringRedisTemplate.boundValueOps("temp_num").increment(1);
        vo.setSenceStr("临时二维码"+num);
        String url="https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+accessTokenService.getAccessToken();
        String jsonString = JSON.toJSONString(vo);
        System.out.println(vo);
        String responseText = NetTool.post(url, jsonString);
        JSONObject jsonObject = JSON.parseObject(responseText);
        if (jsonObject.containsKey("errcode")){
            System.out.println("创建失败");
            return null;
        }else{
            QrCodeResponse qrCodeResponse = JSON.parseObject(responseText, QrCodeResponse.class);
            return qrCodeResponse;
        }
    }
}
