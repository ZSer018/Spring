package com.example.a_start.d_annotation_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("start/applicationContext_annotation.xml");
        Animal animal1 = context.getBean("catBean", Animal.class);
        Animal animal2 = context.getBean("dogBean", Animal.class);
        Animal animal3 = context.getBean("dogBean", Animal.class);
        Animal animal4 = context.getBean("dogBean", Animal.class);
        Animal animal5 = context.getBean("dogBean", Animal.class);

        animal1.say();
        animal2.say();
        animal3.say();
        animal4.say();
        animal5.say();

        context.close();
    }
}
