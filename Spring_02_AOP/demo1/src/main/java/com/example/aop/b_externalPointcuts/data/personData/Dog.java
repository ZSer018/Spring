package com.example.aop.b_externalPointcuts.data.personData;

public class Dog implements Animal{

    @Override
    public void say() {
        System.out.println("wof - wof");
    }
}