package com.qa.main;

public class BottlesOfBeer {

    public void bottleOfBeer(int numberOfBeer) {
        for (int i = numberOfBeer; i >= 0; i--) {
            if (i > 0) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, "  + (i - 1) + " bottles of beer on the wall.");
            }

            else if (i == 1) {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, "  + (i - 1) + " bottles of beer on the wall.");
            }

            else {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }
        }
    }
}
