package com.bootdemo.controller;

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

}
