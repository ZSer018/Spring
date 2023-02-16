package com.sergeyzinoviev.spring.mvc;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.*;

public class Employee {
    @Size(min = 2, max = 16)
    private String name;
    @NotEmpty
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private List<String> carBrands;
    private String[] languages;
    private List<String> languageList;

    public String[] getLanguages() {
        return languages != null? languages.clone(): languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getDepartments() {
        return new HashMap<>(departments);
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public List<String> getLanguageList() {
        return new ArrayList<>(languageList);
    }

    public void setLanguageList(List<String> languageList) {
        this.languageList = languageList;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("Inf tec","IT");
        departments.put("Human Resources","HR");
        departments.put("Sales","Sales");
        departments.put("DevOps","Developers");

        carBrands = new ArrayList<>();
        carBrands.add("Audi");
        carBrands.add("BMW");
        carBrands.add("Mersedes");

        languageList = new ArrayList<>();
        languageList.add("Rus");
        languageList.add("Eng");
        languageList.add("Ger");
   }


    public static void main(String[] args) {
        Employee employee= new Employee();
        var temp  = employee.getLanguageList();
        temp.add("1");
        temp.add("2");

        employee.languageList.remove(0);

        System.out.println("-------copy-------");
        temp.forEach(System.out::println);
        System.out.println("-------orign-------");
        employee.languageList.forEach(System.out::println);
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public List<String> getCarBrands() {
        return new ArrayList<>(carBrands);
    }

    public void setCarBrands(List<String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
