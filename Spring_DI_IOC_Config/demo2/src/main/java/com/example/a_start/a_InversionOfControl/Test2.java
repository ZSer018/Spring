package com.example.a_start.a_InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("start/applicationContext_di_constructor.xml");

        Animals animals = context.getBean("myPet",  Animals.class);
        animals.say();
    }
}
