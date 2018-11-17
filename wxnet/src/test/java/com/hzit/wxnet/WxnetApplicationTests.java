package com.hzit.wxnet;

import com.hzit.wxnet.service.AccessTokenService;
import com.hzit.wxnet.service.MessageService;
import com.hzit.wxnet.service.QrcodeService;
import com.hzit.wxnet.service.WxUserinfoService;
import com.hzit.wxnet.service.vo.*;
import com.hzit.wxnet.service.vo.QrCode.QrCodeResponse;
import com.hzit.wxnet.service.vo.QrCode.QrCodeVo;
import com.hzit.wxnet.service.vo.imageAndTextMessage.Article;
import com.hzit.wxnet.service.vo.imageAndTextMessage.ImageAndTextMessageVo;
import com.hzit.wxnet.service.vo.imageAndTextMessage.News;
import com.hzit.wxnet.service.vo.openid.Data;
import com.hzit.wxnet.service.vo.openid.WxPageVo;
import com.hzit.wxnet.service.vo.tag.CreateOrDeleteTagVo;
import com.hzit.wxnet.service.vo.tag.TagListVo;
import com.hzit.wxnet.service.vo.tag.TagVo;
import com.hzit.wxnet.service.vo.textMessage.Text;
import com.hzit.wxnet.service.vo.textMessage.TextMessageVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WxnetApplicationTests {

 @Autowired
  private  AccessTokenService accessTokenService;
 @Autowired
 private QrcodeService qrcodeService;
 @Autowired
 private MessageService messageService;
 @Autowired
 private WxUserinfoService wxUserinfoService;


    //获取access_token
    @Test
    public void testGet(){
        String accessToken = accessTokenService.getAccessToken();
        System.out.println(accessToken);
    }



    //发送文本消息
    @Test
    public void testGet3(){
        TextMessageVo messageVo = new TextMessageVo();
        messageVo.setTouser("orPGy0vIzeNSma9R_6mlOkxAFxqU");
        messageVo.setMsgType("text");
        Text text = new Text("你好");
        messageVo.setText(text);
        String s = messageService.sendMsg(messageVo);
        System.out.println(s);
    }

    //发送图文消息
    @Test
    public void test4(){
        ImageAndTextMessageVo vo=new ImageAndTextMessageVo();
        vo.setTouser("orPGy0vIzeNSma9R_6mlOkxAFxqU");
        vo.setMsgType("news");
        News news = new News();
        Article item = new Article();
        item.setTitle("---十八🈲---");
        item.setUrl("http://www.iqiyi.com/a_19rrgypi19.html?vfm=2008_aldbd");
        item.setPicurl("http://img3.imgtn.bdimg.com/it/u=1599715544,866998597&fm=11&gp=0.jpg");
        item.setDescription("始皇大战赵小臭");
        news.getArticles().add(item);
        vo.setNews(news);
        String s = messageService.sendMsg(vo);
        System.out.println(s);
    }

   // 根据用户的OPENid获取用户信息
    @Test
    public void test5(){
        WxUserInfoVo byOpenId = wxUserinfoService.findByOpenId("orPGy0vIzeNSma9R_6mlOkxAFxqU");
       // System.out.println(byOpenId);

    }

    //获取所有用户的OPENID
    @Test
    public void test6(){
        WxPageVo all = wxUserinfoService.findAll(null);
        Data data = all.getData();
        List<String> openid = data.getOpenid();
        for (String s:openid){
            System.out.println(s);
        }
    }

     //创建一个用户标签
    @Test
    public void test7(){
        TagVo tagVo = wxUserinfoService.createTag("猛男");
        System.out.println(tagVo);
    }
    //获取所有标签
    @Test
    public void test8(){
        TagListVo tagListVo = wxUserinfoService.fingAllTagVo();
        System.out.println(tagListVo);
    }

    //删除标签
    @Test
    public void test9() {
        String s = wxUserinfoService.deleteTag(100);
        System.out.println(s);
        String s1 = wxUserinfoService.deleteTag(101);
        System.out.println(s1);
        String s2 = wxUserinfoService.deleteTag(102);
        System.out.println(s2);
        String s3 = wxUserinfoService.deleteTag(103);
        System.out.println(s3);

    }

    //给一批指定openid的用户打上标签
    @Test
    public void test10() {
        CreateOrDeleteTagVo createOrDeleteTagVo = new CreateOrDeleteTagVo();
        createOrDeleteTagVo.getOpenid_list().add("orPGy0vIzeNSma9R_6mlOkxAFxqU");
        createOrDeleteTagVo.getOpenid_list().add("orPGy0msIhuG4CSRG3RlVdba6Uqs");
        createOrDeleteTagVo.setTagid(104);
        wxUserinfoService.createTagForUser(createOrDeleteTagVo);
    }

    //获取指定标签下的用户列表
    @Test
    public void test11() {
        WxPageVo wxPageVo = wxUserinfoService.getWxUserinfoByTagId(104);
        System.out.println(wxPageVo);
    }

    //利用Redis自动生成场景值来创建永久二维码
    @Test
    public void test12(){
        QrCodeResponse qrcode = qrcodeService.createLimitQrcode();
        System.out.println(qrcode);
    }

    //利用Redis自动生成场景值来创建临时二维码
    @Test
    public void test13(){
        QrCodeResponse tempQrcode = qrcodeService.createTempQrcode(20);
        System.out.println(tempQrcode);
    }
}
