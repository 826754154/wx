package com.hzit.wxweb;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.hzit")
public class WxwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxwebApplication.class, args);
    }

    @Bean
    public Queue sub(){
        return new Queue("zhangwentao_sub");
    }

    @Bean
    public Queue unsub(){
        return new Queue("zhangwentao_unsub");
    }
    @Bean
    public Queue scan(){
        return new Queue("zhangwentao_scan");
    }
}
