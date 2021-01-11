package com.qa.main;

public class Runner {

    public static void main(String[] args) {

        Person henry = new Person("Henry Oliver-Edwards", 22, "QA Trainee");
        System.out.println(henry.toString());

        Person joe = new Person("Joe Oliver-Welsh", 29, "Chef");
        System.out.println(joe);

        Person sam = new Person("Sam Oliver-Welsh", 31, "Consultant");

        PersonList myPersonList = new PersonList();
        myPersonList.myPersonList.add(henry);
        myPersonList.myPersonList.add(joe);
        myPersonList.myPersonList.add(sam);

        System.out.println(myPersonList.myPersonList.toString());

        System.out.println(myPersonList.searchByName("Henry"));
        System.out.println(myPersonList.searchByName("Henry Oliver-Edwards"));
        System.out.println(myPersonList.searchByName("Sam Oliver-Welsh"));

        System.out.println("Separating the code");

        myPersonList.forEach(System.out::println);

    }
}
