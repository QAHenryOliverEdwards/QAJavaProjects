package com.qa.main;

import java.util.Scanner;

public class ScannerController {

    static int main(Scanner input) {

        System.out.println("Choose an option - 1: Create Person, 2: Output all people, 3: Search for people, 4: Exit");
        int option = input.nextInt();
        switch (option) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    static String createName(Scanner input) {
        String returnString = "";
        System.out.println("Enter name: ");
        String inputString = input.next();

        return returnString + inputString;
    }

    static int createAge(Scanner input) {
        int returnAge = 0;
        System.out.println("Enter age: ");
        int inputAge = input.nextInt();

        return returnAge + inputAge;
    }

    static String createJobTitle(Scanner input) {
        String returnString = "";
        System.out.println("Enter job title: ");
        String inputString = input.next();

        return returnString + inputString;
    }

    static String searchByName(Scanner input) {
        String searchString = "";
        System.out.println("Enter the name of the person you want to find: ");
        String inputString = input.next();

        return searchString + inputString;
    }
}
