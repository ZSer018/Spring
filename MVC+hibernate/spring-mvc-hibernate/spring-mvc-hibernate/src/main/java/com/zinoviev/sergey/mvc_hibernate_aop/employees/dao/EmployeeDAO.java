package com.zinoviev.sergey.mvc_hibernate_aop.employees.dao;

import com.zinoviev.sergey.mvc_hibernate_aop.employees.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void removeEmployee(int id);
}
