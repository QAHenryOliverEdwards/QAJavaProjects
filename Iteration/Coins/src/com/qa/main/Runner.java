package com.qa.main;

public class Runner {

    public static void main(String[] args) {

        Coins myRemainder = new Coins();
        System.out.println(myRemainder.changeCalculator(5.99, 7.50));
        System.out.println(myRemainder.changeCalculator(10.99, 20));
        System.out.println(myRemainder.changeCalculator(200, 100));


    }

}
