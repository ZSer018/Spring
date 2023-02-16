package com.example.a_start.d_annotation_config;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("catBean")
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
