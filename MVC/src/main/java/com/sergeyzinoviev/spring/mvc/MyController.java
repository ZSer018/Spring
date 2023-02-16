package com.sergeyzinoviev.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/oldview-employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

/*    @RequestMapping("/showDetails")
    public String showEmpDetails(){
        return "show-emp-detais-view";
    }*/

/*    @RequestMapping("/showDetails") //TODO JAKARTA SERVLET!
    public String showEmpDetails(HttpServletRequest request, Model model){
        String empName = request.getParameter("employeeName");
        empName = "Mr."+empName;
        model.addAttribute("nameAttribute", empName);

        return "show-emp-detais-view";
    }*/


    @RequestMapping("/showDetails")
    public String showEmpDetails(@RequestParam("employeeName") String request, Model model){
        request = "Mr."+request;
        model.addAttribute("nameAttribute", request);

        return "show-emp-detais-view";
    }

}
