package com.hzit.wxweb.Service;

public interface WxService {

    /**
     * 实现要处理的各种业务逻辑功能
     * @param jsonstr 发送过来的是一个json字符串
     *///返回的是一个用来描述信息的XML字符串
    String doingService(String jsonstr);


    /**
     * 用户点击关注时，根据OPENID 找到该用户对象，将该用户对象发送到消息队列中
     */

}
