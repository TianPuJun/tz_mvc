package com.tz.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author https://github.com/TianPuJun @无痕
 * @ClassName TestController
 * @Description
 * @Date 16:55 2020/3/25
 **/
@RequestMapping("/test")
@Controller
public class TestController {
    @RequestMapping("/rest")
    @ResponseBody
    public String test(){
        return "hello mvc start success";
    }
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
