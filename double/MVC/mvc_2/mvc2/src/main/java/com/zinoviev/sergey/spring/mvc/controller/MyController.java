package com.zinoviev.sergey.spring.mvc.controller;

import com.zinoviev.sergey.spring.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String indexPage(){
        return "index";
    }

    @RequestMapping("/newUser")
    public String regNewUser(Model model){
        model.addAttribute("userData", new User());
        return "register-new-user";
    }

    @RequestMapping("/regComplete")
    public String userRegComplete(@ModelAttribute("userData") User user){
        return "reg-complete";
    }

}
