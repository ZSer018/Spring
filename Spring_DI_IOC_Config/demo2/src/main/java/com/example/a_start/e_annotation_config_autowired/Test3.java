package com.example.a_start.e_annotation_config_autowired;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("start/applicationContext_annotation.xml");
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person);
        person.callYourePet();
        context.close();

    }
}
