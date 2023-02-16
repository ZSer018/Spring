package com.example.a_start.b_dipendensy_injection.di_b_setter;

public class Person {

    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void callYourePet(){
        System.out.println("Hello pet! ");
        animal.say();
    }
}
