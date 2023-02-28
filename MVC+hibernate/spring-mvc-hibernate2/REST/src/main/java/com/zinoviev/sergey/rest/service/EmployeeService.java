package com.zinoviev.sergey.rest.service;

import com.zinoviev.sergey.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
    public void saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
}
