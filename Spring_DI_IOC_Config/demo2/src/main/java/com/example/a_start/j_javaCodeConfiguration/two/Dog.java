package com.example.a_start.j_javaCodeConfiguration.two;


public class Dog implements Animal {

    private static int dogCount = 0;

    public Dog() {
        System.out.println("annotated Dog has created "+dogCount);
        dogCount++;
    }


    private void destroy(){
        dogCount--;
        System.out.println(dogCount);
    }

    private void init(){
        System.out.println("INIT");
    }

    @Override
    public void say() {
        System.out.println("Gaw- Gaw");
    }
}
