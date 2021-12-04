package edu.soft2.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
    //接受处理数据
    //调用业务
    //页面跳转
    @RequestMapping(value = "/sayHello")
    public String sayHello(HttpRequest request){
        System.out.println("hello springmvc");
        return "success";//页面跳转(与视图解析器的前后缀拼接处url)
        //默认用的forward转发的方式跳转
    }
    @RequestMapping("/sayHi")
    public String sayHi(){
        System.out.println("----sayHi()----");
        return "Hi";
    }
}
