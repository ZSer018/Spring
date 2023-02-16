package com.example.aop.b_externalPointcuts;



import com.example.aop.b_externalPointcuts.config.MyConfig;
import com.example.aop.b_externalPointcuts.data.Hotel;
import com.example.aop.b_externalPointcuts.data.RentHouse;
import com.example.aop.b_externalPointcuts.data.TwoStarHostel;
import com.example.aop.b_externalPointcuts.data.personData.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Hotel hotel = context.getBean("hotelBean", Hotel.class);
        TwoStarHostel hostel = context.getBean("getTwoStarHostelBean", TwoStarHostel.class);
        RentHouse rentHouse = context.getBean("getRentHouseBean", RentHouse.class);

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            personList.add(context.getBean("getPersonBean", Person.class));
        }

        personList.forEach(System.out::println);
        System.out.println();
        System.out.println("----------- chaper two: check in ---------" );
        for (int i = 0; i < 10; i++) {
            if (i < 3){
                hostel.guestCheckIn(personList.get(i));
                hostel.guestCheckOut();
            } else if (i < 6) {
                hotel.guestCheckIn(personList.get(i));
                Person p = null;
                hotel.getPersonList().forEach(Person::showPassport);
            } else {
               rentHouse.guestCheckIn(personList.get(i));
            }
        }

        hotel.getPersonList().forEach(System.out::println);

        context.close();
    }
}
