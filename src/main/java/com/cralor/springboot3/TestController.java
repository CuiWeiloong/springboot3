package com.cralor.springboot3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {


    @RequestMapping( "aaa")
    public String test5(){
        return "redirect:test.html";
    }
    @RequestMapping( "bbb")
    public String test6(){
        return "thymeleaft";
    }

}
