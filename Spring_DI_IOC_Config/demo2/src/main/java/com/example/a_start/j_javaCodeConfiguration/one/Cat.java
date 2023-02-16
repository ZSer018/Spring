package com.example.a_start.j_javaCodeConfiguration.one;

import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")
@Scope("prototype")
public class Cat implements Animal {

    public Cat() {
        System.out.println("annotated Cat has created");
    }

    @Override
    public void say() {
        System.out.println("Mew - Mew");
    }

    public void init(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
