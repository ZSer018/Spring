package com.example.a_start.j_javaCodeConfiguration.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Animal catBean(){
        return new Cat();
    }


    @Bean
    @Scope("prototype")
    public Animal dogBean(){
        return new Dog();
    }


    @Bean
    public Person personBeanCat(){
        return new Person(catBean());
    }

    @Bean
    public Person personBeanDog(){
        return new Person(dogBean());
    }

}
