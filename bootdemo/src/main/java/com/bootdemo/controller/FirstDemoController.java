package com.bootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiuKai on 2018/2/27.
 */
@RestController
@EnableAutoConfiguration
public class FirstDemoController {

    private Logger logger = LoggerFactory.getLogger(FirstDemoController.class);

    @RequestMapping("/")
    String home(){
        return "hello world!";
    }

    @RequestMapping("/test")
    public String test(){
        logger.info("1111111111111111111111111111111");
        return "test";
    }

}
