package com.example.aop.a_simplePointcuts.libraryes;



public class SchoolLibrary extends Library{
    public void getBook(){
        System.out.println("SchoolLibrary: Book out");
    }

    public String myMethodLalala(){
        System.out.println("SchoolLibrary: myMethodLalala String ");
        return "OK";
    }

    public String saySome(String a, int b, double c){
        System.out.println("say some");
        return "";
    }
}
