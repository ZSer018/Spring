package com.sergeyzinoviev.spring.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEMail {
     public String value() default "xyz.com";
     public String message() default "email must be like: ...xyz.com";

     public Class<?>[] groups() default {};
     public Class<? extends Payload>[] payload() default {};
}
