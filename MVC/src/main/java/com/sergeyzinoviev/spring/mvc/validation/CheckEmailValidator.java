package com.sergeyzinoviev.spring.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEMail, String> {

    private String emailTail;

    @Override
    public void initialize(CheckEMail checkEMail) {
        emailTail = checkEMail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(emailTail);
    }
}
