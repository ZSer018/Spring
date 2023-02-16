package com.example.a_start.j_javaCodeConfiguration.two;


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

    public void destroy(){
        System.out.println("destroy");
    }
}
