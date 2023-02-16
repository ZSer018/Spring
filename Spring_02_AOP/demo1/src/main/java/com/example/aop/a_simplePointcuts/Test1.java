package com.example.aop.a_simplePointcuts;

import com.example.aop.a_simplePointcuts.config.MyConfig;
import com.example.aop.a_simplePointcuts.libraryes.SchoolLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
        schoolLibrary.saySome("", 1, 1.22);
       // schoolLibrary.getBook();

       // UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
       // uniLibrary.
       // uniLibrary.getBook();
        //uniLibrary.getMagazine();

        //schoolLibrary.myMethodLalala();
       // uniLibrary.myMethod();

        context.close();
    }
}
