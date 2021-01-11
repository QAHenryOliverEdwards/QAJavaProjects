package com.qa.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PersonList extends ArrayList<Person>{

    List<Person> myPersonList = new ArrayList<>();

    public Person searchByName(String name) {
        Person myPerson = new Person(null, 0, null);
        for (Person person: myPersonList) {
            if (person.getName().equals(name)) {
                myPerson = person;
            }
        }

        return myPerson;
    }

    @Override
    public void forEach(Consumer action) {
        for(Person person: myPersonList) {
            action.accept(person);
        }
    }
}
