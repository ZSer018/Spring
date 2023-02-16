package com.example.a_start.f_scope_postConstruct_PreDestroy;


import com.example.a_start.e_annotation_config_autowired.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("start/applicationContext_annotation.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourePet();
        context.close();

    }
}
