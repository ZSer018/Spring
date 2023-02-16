package com.example.a_start.j_javaCodeConfiguration.one;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Animal {

    private static int dogCount = 0;

    public Dog() {
        System.out.println("annotated Dog has created "+dogCount);
        dogCount++;
    }

    @PreDestroy
    private void destroy(){
        dogCount--;
        System.out.println(dogCount);
    }

    @PostConstruct
    private void init(){
        System.out.println("INIT");
    }

    @Override
    public void say() {
        System.out.println("Gaw- Gaw");
    }
}
