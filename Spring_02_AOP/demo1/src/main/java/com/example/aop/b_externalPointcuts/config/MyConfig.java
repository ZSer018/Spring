package com.example.aop.b_externalPointcuts.config;

import com.example.aop.b_externalPointcuts.data.Hotel;
import com.example.aop.b_externalPointcuts.data.RentHouse;
import com.example.aop.b_externalPointcuts.data.TwoStarHostel;
import com.example.aop.b_externalPointcuts.data.personData.*;
import org.springframework.context.annotation.*;

import java.util.Random;

@Configuration
@ComponentScan("com.example.aop.b_externalPointcuts")
@EnableAspectJAutoProxy
public class MyConfig {

    @Bean("hotelBean")
    public Hotel getHotelBean(){
        return new Hotel();
    }

    @Bean
    public TwoStarHostel getTwoStarHostelBean(){ return new TwoStarHostel();}

    @Bean
    public RentHouse getRentHouseBean(){ return new RentHouse(); }

    @Bean
    @Scope("prototype")
    public Animal getAnimalBean(){
        int x = new Random().nextInt(3)+1;

        if (x == 1) {
            return new Dog();
        } else if (x == 2) {
            return new Cat();
        } else
            return new Bird();
    }

    @Bean
    @Scope("prototype")
    public Person getPersonBean(){
        String[] names = new String[]{"Antony", "Sergey", "Belly", "Tommy", "Anna", "Mary", "Katya", "Elisabeth", "Teddy", "Elena"};
        int x = new Random().nextInt(9)+1;

        return new Person(getAnimalBean(), names[x], new Random().nextInt(70)+18);
    }
}
