package com.qa.main;

public class Runner {

    public static void main(String[] args) {

        Numbers testnum = new Numbers();
        System.out.println(testnum.sumIndividualParts(12));
        System.out.println(testnum.sumIndividualParts(66));
        System.out.println(testnum.sumIndividualParts(45));

        System.out.println(testnum.translate(21));
        System.out.println(testnum.translate(45));
        System.out.println(testnum.translate(79));

    }

}
