package com.example.aop.a_simplePointcuts.libraryes;



public class UniLibrary extends Library{
    public void getBook(){
        System.out.println("UniLibrary: Book out");
    }

    public void getMagazine(){
        System.out.println("Взят журнал из университетской библиотеки");
    }

    public void myMethod(){
        System.out.println("UniLibrary: myMethod String ");
    }
}
