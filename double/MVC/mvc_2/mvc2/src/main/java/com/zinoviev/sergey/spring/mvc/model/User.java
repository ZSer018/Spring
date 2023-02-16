package com.zinoviev.sergey.spring.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String mail;
    private int age;
    private String gender;

    private List<String> genderType;

    public User() {
        genderType = new ArrayList<>();
        genderType.add("Male");
        genderType.add("Female");
        genderType.add("Else");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getGenderType() {
        return new ArrayList<>(genderType);
    }

    public void setGenderType(List<String> genderType) {
        this.genderType = genderType;
    }
}
