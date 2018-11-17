package com.hzit.wxnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class WxnetApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxnetApplication.class, args);
        try{
            new CountDownLatch(1).await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
