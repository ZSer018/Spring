package com.example.a_start.j_javaCodeConfiguration.two;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Animal animal1 = context.getBean("catBean", Cat.class);
        Animal animal2 = context.getBean("catBean", Cat.class);

        animal1.say();
        animal2.say();

        Person person = context.getBean("personBeanDog", Person.class);
        System.out.println(person);
        person.callYourePet();

        context.close();
    }
}
