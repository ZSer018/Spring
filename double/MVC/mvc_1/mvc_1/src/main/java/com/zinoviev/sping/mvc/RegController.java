package com.zinoviev.sping.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegController {

    @RequestMapping("/")
    public String firstView(){
        System.out.println("------ /");
        return "index";
    }

    @RequestMapping("/enterData")
    public String enterData(Model model){
        System.out.println("------ /enterData");
        model.addAttribute("user", new User());
        return "userdata-blank";
    }

    @RequestMapping("/regDone")
    public String regDone(@ModelAttribute("user") User user){
        System.out.println("------ /regDone");

        return "reg-ok";
    }
}
