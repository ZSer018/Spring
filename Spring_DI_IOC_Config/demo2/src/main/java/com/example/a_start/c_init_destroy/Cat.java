package com.example.a_start.c_init_destroy;

public class Cat implements Animal {
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
