package com.hzit.wxnet.tools;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class NetTool {



    /**
     * 定义一个公共的发送GET请求的方法
     */
    public static String get(String url){
        System.out.println("------get请求远程调用中------");
        HttpClient ie=HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        HttpResponse execute=null;
        long start=System.nanoTime();
        try {
             execute = ie.execute(get);
            HttpEntity entity = execute.getEntity();
            String responseText = EntityUtils.toString(entity, "utf-8");
           long end=System.nanoTime();
            System.out.println("耗时:"+(end-start)/1000000.0+"毫秒");
            return responseText;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 定义一个公共的发送POST请求的方法
     */
    public static String post(String url,String jsonparmter){
        System.out.println("------post请求远程调用中------");
        HttpClient ie=HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        post.addHeader("content-Type","application/json;charset=utf-8");
        post.setEntity(new StringEntity(jsonparmter,"utf-8"));
        try {
            HttpResponse execute = ie.execute(post);
            HttpEntity entity = execute.getEntity();
            String responseText = EntityUtils.toString(entity, "utf-8");
            return responseText;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
