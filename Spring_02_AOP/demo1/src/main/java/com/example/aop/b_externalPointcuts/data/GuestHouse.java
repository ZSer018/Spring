package com.example.aop.b_externalPointcuts.data;

import com.example.aop.b_externalPointcuts.data.personData.Person;

import java.util.List;

public abstract class GuestHouse {
    abstract void guestCheckIn(Person person);
    abstract Person guestCheckOut();

    abstract List<Person> getPersonList();
}
