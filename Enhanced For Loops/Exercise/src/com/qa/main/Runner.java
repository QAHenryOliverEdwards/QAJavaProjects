package com.qa.main;

public class Runner {

    public static void main(String[] args) {

        LoopClass myLoop = new LoopClass();
        myLoop.loopThrough(new String[]{"Hello", "World", "I", "Exist"});

        myLoop.createNumber1_20Array();
        myLoop.printSquaredNumbers();

        System.out.println(myLoop.isEven(20));
        System.out.println(myLoop.isEven(51));
        System.out.println(myLoop.isEven(100));

        myLoop.squareOrCube();
    }
}
