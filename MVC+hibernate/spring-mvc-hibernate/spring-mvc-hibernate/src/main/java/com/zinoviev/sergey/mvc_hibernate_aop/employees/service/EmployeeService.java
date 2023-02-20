package com.zinoviev.sergey.mvc_hibernate_aop.employees.service;

import com.zinoviev.sergey.mvc_hibernate_aop.employees.entity.Employee;
import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void removeEmployee(int id);
}
