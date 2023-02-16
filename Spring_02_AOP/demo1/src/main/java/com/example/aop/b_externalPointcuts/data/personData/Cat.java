package com.example.aop.b_externalPointcuts.data.personData;

public class Cat implements Animal{

    @Override
    public void say() {
        System.out.println("mew - mew");
    }
}