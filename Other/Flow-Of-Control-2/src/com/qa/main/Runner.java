package com.qa.main;

public class Runner {

    public static void method1() {
        for(int i = 0; i < 10; i++) {
            int number = 20;
            number += i;
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        method1();
    }

}