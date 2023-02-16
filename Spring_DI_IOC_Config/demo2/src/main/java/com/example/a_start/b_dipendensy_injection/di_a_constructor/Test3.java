package com.example.a_start.b_dipendensy_injection.di_a_constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        /*Animal animal = new Dog();
        Person person = new Person(animal);
        person.callYourePet();*/


/*        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_di_constructor.xml");
        Animal animal = context.getBean("myPet", Animal.class);
        Person person = new Person(animal);
        person.callYourePet();
        context.close();*/


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("start/applicationContext_di_constructor.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourePet();
        context.close();

    }
}
