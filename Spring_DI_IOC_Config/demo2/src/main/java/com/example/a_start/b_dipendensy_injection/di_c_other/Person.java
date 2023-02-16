package com.example.a_start.b_dipendensy_injection.di_c_other;

public class Person {

    private String name;
    private int age;
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourePet(){
        System.out.println("Hello pet! ");
        animal.say();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal=" + animal.getClass().getSimpleName() +
                '}';
    }
}
