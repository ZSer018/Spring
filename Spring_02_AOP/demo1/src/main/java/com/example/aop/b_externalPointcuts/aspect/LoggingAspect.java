package com.example.aop.b_externalPointcuts.aspect;

import com.example.aop.b_externalPointcuts.data.personData.Person;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Aspect
@Component
@Order(1)
public class LoggingAspect {

    @Before("execution( * com.example.aop.b_externalPointcuts.data.TwoStarHostel.guestCheckIn(*) )")
    private void beforeCheckInHostel(){
        System.out.println("----- before guestCheckIn logging: TwoStarsHostel");
    }

    @Before("execution( * com.example.aop.b_externalPointcuts.data.Hotel.guestCheckIn(*) )")
    private void beforeCheckInHotel(){
        System.out.println("----- before guestCheckIn logging: Hotel");
    }

    @Before("execution( * com.example.aop.b_externalPointcuts.data.RentHouse.guestCheckIn(*) )")
    private void beforeCheckInRentHouse(){
        System.out.println("----- before guestCheckIn logging: RentHouse");
    }

    @After("execution(* *Out(..))")
    private void afterCheckOut(){
        System.out.println("------- After any GUEST_HOUSE checking out logging");
        System.out.println("-------------");
    }

    @AfterReturning(pointcut = "execution( * get*List())", returning = "list")
    private void afterGetPersonList(List<Person> list){
        list.forEach(person -> person.setLastName("No Last Name"));
    }


    @AfterThrowing(pointcut = "execution( * *(..))", throwing = "myException")
    private void afterGetPersonList(JoinPoint joinPoint, Throwable myException){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Перехватили исключение, брошенное в классе и методе '"+methodSignature + "' : "+myException.getMessage());
    }

}
