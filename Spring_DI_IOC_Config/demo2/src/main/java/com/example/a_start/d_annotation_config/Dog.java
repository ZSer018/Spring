package com.example.a_start.d_annotation_config;

import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")
@Scope("prototype")
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

    @Override
    public void say() {
        System.out.println("Gaw- Gaw");
    }
}
