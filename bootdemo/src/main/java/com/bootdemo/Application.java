package com.bootdemo;

import com.bootdemo.controller.FirstDemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by LiuKai on 2018/2/28.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {// 如果继承了parent ，也可以用mvn spring-boot:run
        SpringApplication.run(Application.class, args);
    }
}
