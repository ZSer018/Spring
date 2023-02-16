package com.example.aop.a_simplePointcuts.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingClass {

    @Before("execution(void com.example.aop.a_simplePointcuts.libraryes.SchoolLibrary.getBook())")
    public void beforeSchoolAddBookAdvice(){
        System.out.println("beforeAddBookAdvice: попытка получения книги в школьной библиотеке");
    }


    @Before("execution(void com.example.aop.a_simplePointcuts.libraryes.UniLibrary.getBook())")
    public void beforeUniAddBookAdvice(){
        System.out.println("beforeAddBookAdvice: попытка получения книги в университетской библиотеке");
    }


    @After("execution(void get*())")
    public void getSome(){
        System.out.println("------- сработал метод ГЕТ в каком-то из классов");
    }


    @After("execution(* my*())")
    public void getSomeMy(){
        System.out.println("------- сработал метод начинающийся с 'my' в каком-то из классов");
    }



    @After("execution(void getBook())")
    public void afterAddBookAdvice(){
        System.out.println("afterAddBookAdvice: Книга получена в какой-то из библиотек");
    }


    @After("execution(* saySome(.., int , ..))")
    public void afterSaySome(){
        System.out.println("Метод, saySome");
    }

}
