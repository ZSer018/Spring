package com.zinovies.sergey.spring.security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "viewAllEmps";
    }


    @GetMapping("/it_info")
    public String getINfoOnlyForIT(){
        return "view_IT_stuff";
    }

    @GetMapping("/art_info")
    public String StringgetForArtInfo(){
        return "view_Art_stuff";
    }



}
