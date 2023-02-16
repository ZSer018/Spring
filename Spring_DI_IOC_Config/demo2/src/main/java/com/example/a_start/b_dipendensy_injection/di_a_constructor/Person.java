package com.example.a_start.b_dipendensy_injection.di_a_constructor;

public class Person {

    private final Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void callYourePet(){
        System.out.println("Hello pet! ");
        animal.say();
    }
}
