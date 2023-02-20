package com.zinoviev.sergey.mvc_hibernate_aop.employees.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class loggingAspect {

    @Around("execution(* com.zinoviev.sergey.mvc_hibernate_aop.employees.dao.*.*(..))")
    public Object aroundAllRepMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methName = methodSignature.getName();
        System.out.println("begin method: "+methName);

        Object result = proceedingJoinPoint.proceed();

        System.out.println("end of:" +methName);
        return result;
    }
}
