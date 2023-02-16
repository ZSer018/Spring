package com.example.aop.b_externalPointcuts.data;

import com.example.aop.b_externalPointcuts.data.personData.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends GuestHouse{

    private final List<Person> personList;

    public Hotel() {
        System.out.println("Hotel was created");
        personList = new ArrayList<>();
    }


    @Override
    public void guestCheckIn(Person person) {
        System.out.println("Person: "+person.getName()+" checked in in Hotel");
        personList.add(person);
    }

    @Override
    public Person guestCheckOut() {
        System.out.println("Person: "+personList.get(0).getName()+" checked out from Hotel");
        return personList.get(0);
    }

    @Override
    public List<Person> getPersonList() {
        return personList;
    }
}
