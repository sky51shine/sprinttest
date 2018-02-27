package com.bootdemo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiuKai on 2018/2/27.
 */
@RestController
@EnableAutoConfiguration
public class FirstDemoController {

    @RequestMapping("/")
    String home(){
        return "hello world!";
    }

    public static void main(String[] args) {// 如果继承了parent ，也可以用mvn spring-boot:run
        SpringApplication.run(FirstDemoController.class, args);
    }
}