package com.qa.main;

import java.util.Scanner;

public class ScannerLogic {

    public static void run(Scanner input) {
        System.out.println("Enter number 1:");
        String string1 = input.nextLine();
        Double number1 = Double.parseDouble(string1);

        System.out.println("Enter number 2:");
        String string2 = input.nextLine();
        Double number2 = Double.parseDouble(string2);

        System.out.println("Choose an operation (+ - * /)");
        String operation = input.nextLine();

        switch (operation) {
            case "+":
                System.out.println("Result: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Result: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Result: " + (number1 * number2));
                break;
            case "/":
                System.out.println("Results: " + (number1 / number2));
                break;
            default:
                System.out.println("Operator not chosen");
                break;
        }
    }
}
