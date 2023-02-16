package com.example.aop.b_externalPointcuts.data;

import com.example.aop.b_externalPointcuts.data.personData.Person;

import java.util.ArrayList;
import java.util.List;

public class TwoStarHostel extends GuestHouse{

    private final List<Person> personList = new ArrayList<>();

    public TwoStarHostel() {
        System.out.println("TwoStarHostel was created");
    }

    @Override
    public void guestCheckIn(Person person) {
        System.out.println("Person: "+person.getName()+" checked in in TwoStarHostel");
        personList.add(person);
    }

    @Override
    public Person guestCheckOut() {
        System.out.println("Person: "+personList.get(0).getName()+" checked out from TwoStarHostel");
        return personList.get(0);
    }

    @Override
    public List<Person> getPersonList() {
        return personList;
    }
}
