package com.qa.main;

import java.util.Scanner;

public class Runner {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Person person1 = new Person("Person 1", 20, "Job 1");
        Person person2 = new Person("Person 2", 25, "Job 2");
        Person person3 = new Person("Person 3", 30, "Job 3");

        PersonList personList = new PersonList();

        personList.addPerson(person1);
        personList.addPerson(person2);
        personList.addPerson(person3);

        System.out.println("Printing out all people using a stream");
        personList.stream().forEach(person -> System.out.println(person));

        System.out.println("Searching for person 2");
        System.out.println(personList.searchByPerson(person2));

        boolean flag = true;

        while (flag) {
            int option = ScannerController.main(input);
            switch (option) {
                case 0:
                    System.out.println("Please choose a valid option");
                    break;
                case 1:
                    String name = ScannerController.createName(input);
                    int age = ScannerController.createAge(input);
                    String jobTitle = ScannerController.createJobTitle(input);
                    personList.addPerson(new Person(name, age, jobTitle));
                    System.out.println("Successfully added to the list");
                    break;
                case 2:
                    personList.stream().forEach(person -> System.out.println(person));
                    break;
                case 3:
                    String searchString = ScannerController.searchByName(input);
                    Person foundPerson = personList.searchByName(searchString);
                    System.out.println("Found the person");
                    System.out.println(foundPerson);
                    break;

                case 4:
                    flag = false;
                    break;

            }
        }

        input.close();
    }
}
