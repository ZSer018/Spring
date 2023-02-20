package com.zinoviev.sergey.mvc_hibernate_aop.employees.controller;

import com.zinoviev.sergey.mvc_hibernate_aop.employees.entity.Employee;
import com.zinoviev.sergey.mvc_hibernate_aop.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployee(Model model){
        List<Employee> employeeList = employeeService.getAllEmployees();
        model.addAttribute("allEmps", employeeList);

        return "all-employees-view";
    }

    @RequestMapping("/addnewemployee")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

   @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model){
        model.addAttribute("employee", employeeService.getEmployee(id));
        return "employee-info";
    }


    @RequestMapping("/removeEmp")
    public String removeEmployee(@RequestParam("empId") int id){
        employeeService.removeEmployee(id);
        return "redirect:/";
    }
}
