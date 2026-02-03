package com.example.app.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Controlers {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/templates")
    public String stt(){
        return "stt.html";
    }
}

@Controller
public class 
