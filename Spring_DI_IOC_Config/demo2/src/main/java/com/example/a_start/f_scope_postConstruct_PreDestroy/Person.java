package com.example.a_start.f_scope_postConstruct_PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Animal animal;

    @Autowired
    @Qualifier("dogBean")
    public void setAnimal(Animal animal) {
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
