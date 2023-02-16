package com.example.aop.b_externalPointcuts.data.personData;

import java.util.ArrayList;
import java.util.List;

public class Person {


   private String name;
    private String lastName;
    private int age;
    private Animal animal;

    public Person(Animal animal, String name, int age) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> showPassport(){
        System.out.println("passport for: " + name);
        List<String> passport = new ArrayList<>();
        passport.add(name);
        passport.add(lastName);
        passport.add(String.valueOf(age));

        return passport;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", animal=" + animal +
                '}';
    }
}
