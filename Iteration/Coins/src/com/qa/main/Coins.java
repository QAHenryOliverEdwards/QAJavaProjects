package com.qa.main;

public class Coins {

    double fiftyNote = 50;
    double twentyNote = 20;
    double tenNote = 10;
    double fiveNote = 5;
    double Pound2 = 2;
    double Pound1 = 1;
    double fiftyP = 0.5;
    double twentyP = 0.2;
    double tenP = 0.1;
    double fiveP = 0.05;
    double twoP = 0.02;
    double oneP = 0.01;


    public String changeCalculator(double cost, double moneyGiven) {
        
        double change = (moneyGiven - cost);
        
        String output = "";

        double fiftyCounter = Math.floor(change / fiftyNote);
        change -= fiftyCounter * 50;
        output += fiftyCounter + " * " + "£50" + "\n";

        double twentyCounter = Math.floor(change / twentyNote);
        change -= twentyCounter * 20;
        output += twentyCounter + " * " + "£20" + "\n";

        double tenCounter = Math.floor(change / tenNote);
        change -= tenCounter * 10;
        output += tenCounter + " * " + "£10" + "\n";

        double fiveCounter = Math.floor(change / fiveNote);
        change -= fiveCounter * 5;
        output += fiveCounter + " * " + "£5" + "\n";

        double twoPoundCounter = Math.floor(change / Pound2);
        change -= twoPoundCounter * 2;
        output += twoPoundCounter + " * " + "£2" + "\n";

        double onePoundCounter = Math.floor(change / Pound1);
        change -= onePoundCounter * 1;
        output += onePoundCounter + " * " + "£1" + "\n";

        double fiftyPCounter = Math.floor(change / fiftyP);
        change -= fiftyPCounter * 0.5;
        output += fiftyPCounter + " * " + "50p" + "\n";

        double twentyPCounter = Math.floor(change / twentyP);
        change -= twentyPCounter * 0.2;
        output += twentyPCounter + " * " + "20p" + "\n";

        double tenPCounter = Math.floor(change / tenP);
        change -= tenPCounter * 0.1;
        output += tenPCounter + " * " + "10p" + "\n";

        double fivePCounter = Math.floor(change / fiveP);
        change -= fivePCounter * 0.05;
        output += fivePCounter + " * " + "5p" + "\n";

        double twoPCounter = Math.floor(change / twoP);
        change -= twoPCounter * 0.02;
        output += twoPCounter + " * " + "2p" + "\n";

        double onePCounter = Math.floor(change / oneP);
        change -= onePCounter * 0.01;
        output += onePCounter + " * " + "1p" + "\n";


        return output;
    }
}
