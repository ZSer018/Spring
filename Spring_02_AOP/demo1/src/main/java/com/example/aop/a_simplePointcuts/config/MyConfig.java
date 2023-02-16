package com.example.aop.a_simplePointcuts.config;


import com.example.aop.a_simplePointcuts.libraryes.SchoolLibrary;
import com.example.aop.a_simplePointcuts.libraryes.UniLibrary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.aop.a_simplePointcuts")
@EnableAspectJAutoProxy
public class MyConfig {

    @Bean
    public SchoolLibrary schoolLibraryBean(){
        return new SchoolLibrary();
    }

    @Bean
    public UniLibrary uniLibraryBean(){
        return new UniLibrary();
    }


}
