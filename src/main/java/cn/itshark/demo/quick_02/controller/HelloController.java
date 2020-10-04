package cn.itshark.demo.quick_02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
@RequestMapping("/hello")
    public String sayhello(){
    //默认在,//classpath:/templates/success.html
    return "success";
}
    @RequestMapping("/answer")
    public String answer(Map<String,Object>map){
    map.put("aw","ok!");
    map.put("stu", Arrays.asList("刘备","关羽","张飞"));
    return "success";
    }
}
