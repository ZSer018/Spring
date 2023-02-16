package com.example.a_start.j_javaCodeConfiguration.two;

import org.springframework.beans.factory.annotation.Value;

public class Person {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourePet(){
        System.out.println("Hello pet! ");
        animal.say();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal=" + animal.getClass().getSimpleName() +
                '}';
    }
}
