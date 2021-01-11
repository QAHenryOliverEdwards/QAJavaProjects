package com.qa.main;

public class Person {

    private String name;
    private int age;
    private String jobTtitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTtitle() {
        return jobTtitle;
    }

    public void setJobTtitle(String jobTtitle) {
        this.jobTtitle = jobTtitle;
    }

    public Person (String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTtitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobTtitle='" + jobTtitle + '\'' +
                '}';
    }
}
