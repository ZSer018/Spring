package com.example.aop.b_externalPointcuts.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class SecurityAspect {

    @Before("execution( * *In(*) ) || execution( * *Out(*) )")
    private void beforeCheckInHostel(){
        System.out.println("Security");
    }

    @Around("execution(public * showPassport())")
    private List<String> checkPassport(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("Делаем что то до вызова метода showPassport()");

        List<String> targetMethood = (List<String>) joinPoint.proceed();
        targetMethood.forEach(System.out::println);

        System.out.println("Делаем что то после вызова метода showPassport()");
        return targetMethood;
    }

}
