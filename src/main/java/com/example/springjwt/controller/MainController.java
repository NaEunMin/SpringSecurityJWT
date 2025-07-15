package com.example.springjwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody //Web이 아닌 특정한 문자열이나 객체 리턴
public class MainController {

    @GetMapping("/")
    public String mainP(){
        return "main Controller";
    }
}
