package com.example.a_start.b_dipendensy_injection.di_b_setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("start/applicationContext_di_setter.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourePet();
        context.close();
    }
}
