package com.qa.main;

import java.util.Random;


public class Runner {
	
    public static void main(String[] args) {
        System.out.println(rollTwoDTwenty());
    }

    public static int rollTwoDTwenty() {
        int total = 0;
        total += rollDTwenty();
        total += rollDTwenty();
        return total;
    }

    public static int rollDTwenty() {
    	Random randomiser = new Random();
        return randomiser.nextInt(21);
    }

}
