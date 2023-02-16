package com.example.aop.b_externalPointcuts.data.personData;

public class Bird implements Animal{

    @Override
    public void say() {
        System.out.println("twirk - twirk");
    }
}
