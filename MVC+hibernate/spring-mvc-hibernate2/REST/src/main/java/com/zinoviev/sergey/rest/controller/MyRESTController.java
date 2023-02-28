package com.zinoviev.sergey.rest.controller;

import com.zinoviev.sergey.rest.entity.Employee;
import com.zinoviev.sergey.rest.exception.NoEmployeeException;
import com.zinoviev.sergey.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    // получение работника
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);

        if (employee == null){
            throw new NoEmployeeException("No employee");
        }
        return employee;
    };

    // изменение
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    };

    // добавление
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    };


    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
        if (employee == null){
            throw new NoEmployeeException("there is no employee with id "+id);
        }
        employeeService.deleteEmployee(id);
        return "Employee was deleted";
    }


    // получение списка
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    };
}
