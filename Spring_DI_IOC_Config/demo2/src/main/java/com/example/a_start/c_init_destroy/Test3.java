package com.example.a_start.c_init_destroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("start/applicationContext_init_destroy.xml");
        Animal animal = context.getBean("myPet", Animal.class);
        animal.say();
        context.close();
    }
}
