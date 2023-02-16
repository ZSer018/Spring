package com.example.a_start.b_dipendensy_injection.di_c_other;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("start/applicationContext_di_other.xml");
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person);
        person.callYourePet();
        context.close();
    }
}
