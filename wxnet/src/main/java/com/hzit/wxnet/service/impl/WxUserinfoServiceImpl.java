package com.hzit.wxnet.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hzit.wxnet.service.AccessTokenService;
import com.hzit.wxnet.service.WxUserinfoService;
import com.hzit.wxnet.tools.NetTool;
import com.hzit.wxnet.service.vo.openid.WxPageVo;
import com.hzit.wxnet.service.vo.WxUserInfoVo;
import com.hzit.wxnet.service.vo.tag.CreateOrDeleteTagVo;
import com.hzit.wxnet.service.vo.tag.TagListVo;
import com.hzit.wxnet.service.vo.tag.TagVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxUserinfoServiceImpl implements WxUserinfoService {
    @Autowired
    private AccessTokenService accessTokenService;


    @Override
    public WxUserInfoVo findByOpenId(String openid) {
        String accessToken = accessTokenService.getAccessToken();
        String url="https://api.weixin.qq.com/cgi-bin/user/info?access_token="+accessToken+"&openid="+openid+"&lang=zh_CN";
        String responseText=NetTool.get(url);
        JSONObject obj = JSON.parseObject(responseText);
        if (obj.containsKey("errcode")){
            return null;
        }else{
            WxUserInfoVo wxUserInfoVo = JSON.parseObject(responseText, WxUserInfoVo.class);
            System.out.println(responseText);
            System.out.println(wxUserInfoVo);
            return wxUserInfoVo;
        }
    }

    @Override
    public WxPageVo findAll(String nextopenid) {
        String accessToken = accessTokenService.getAccessToken();
        String url="https://api.weixin.qq.com/cgi-bin/user/get?access_token="+accessToken;
        if (nextopenid!=null){
            url=url+"&next_openid="+nextopenid;
        }
        String responseText=NetTool.get(url);
        JSONObject obj = JSON.parseObject(responseText);
        if (obj.containsKey("errcode")){
            return null;
        }else{
            WxPageVo wxPageVo = JSON.parseObject(responseText, WxPageVo.class);
            return wxPageVo;
        }

    }

    @Override
    public TagVo createTag(String tagname) {
        String accessToken = accessTokenService.getAccessToken();
        String url="https://api.weixin.qq.com/cgi-bin/tags/create?access_token="+accessToken;
        String jsonString = "{   \"tag\" : {     \"name\" : \""+tagname+"\"  } }";
        String responseText = NetTool.post(url, jsonString);
        JSONObject obj = JSON.parseObject(responseText);
        if (obj.containsKey("errcode")){
            return null;
        }else {
            TagVo tagVo = JSON.parseObject(responseText, TagVo.class);
            return tagVo;
        }
    }

    @Override
    public WxPageVo getWxUserinfoByTagId(int tagid) {
        String url="https://api.weixin.qq.com/cgi-bin/user/tag/get?access_token="+accessTokenService.getAccessToken();
        String jsonstring="{   \"tagid\" : "+tagid+" }";
        String responseText = NetTool.post(url, jsonstring);
        JSONObject obj = JSON.parseObject(responseText);
        if (obj.containsKey("errcode")){
            return null;
        }else {
            WxPageVo wxPageVo = JSON.parseObject(responseText, WxPageVo.class);
            return wxPageVo;
        }
    }

    @Override
    public TagListVo fingAllTagVo() {
        String url="https://api.weixin.qq.com/cgi-bin/tags/get?access_token="+accessTokenService.getAccessToken();
        String responseText = NetTool.get(url);
        JSONObject obj = JSON.parseObject(responseText);
        System.out.println(responseText);
        if (obj.containsKey("errcode")){
            return null;
        }else{
            TagListVo tagListVo = JSON.parseObject(responseText, TagListVo.class);
            return tagListVo;
        }
    }

    @Override
    public String deleteTag(int tagid) {
        String url="https://api.weixin.qq.com/cgi-bin/tags/delete?access_token="+accessTokenService.getAccessToken();
        String jsonString="{   \"tag\":{   \"id\" : "+tagid+"   } }";
        String responseText = NetTool.post(url, jsonString);
        return responseText;
    }

    @Override
    public void createTagForUser(CreateOrDeleteTagVo vo) {
        String url="https://api.weixin.qq.com/cgi-bin/tags/members/batchtagging?access_token="+accessTokenService.getAccessToken();
        String jsonString = JSON.toJSONString(vo);
        System.out.println(jsonString);
        String responseText = NetTool.post(url, jsonString);
        System.out.println(responseText);
    }

    @Override
    public void deleteTagForUser(CreateOrDeleteTagVo vo) {
        String url="https://api.weixin.qq.com/cgi-bin/tags/members/batchuntagging?access_token="+accessTokenService.getAccessToken();
        String jsonString = JSON.toJSONString(vo);
        String responseText = NetTool.post(url, jsonString);
        System.out.println(responseText);
    }
}
