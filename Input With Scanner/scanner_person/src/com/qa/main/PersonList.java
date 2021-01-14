package com.qa.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PersonList extends ArrayList {

    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public Person searchByPerson(Person person) {
        Person returnPerson = null;
        for (Person p : personList) {
            if (p == person) {
                returnPerson = p;
            }
        }
        return returnPerson;
    }

    public Person searchByName(String name) {
        Person returnPerson = null;
        for (int i = 0; i < personList.size(); i++) {
            if (name.equals(personList.get(i).getName())) {
                returnPerson = personList.get(i);
            }
        }
        return returnPerson;
    }

    @Override
    public Stream stream() {
        return personList.stream();
    }
}
