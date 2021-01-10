package com.qa.main;

public class LoopClass {

    int[] array1_20 = new int[20];

    public void loopThrough(String[] strArray) {
        for (String str : strArray) {
            System.out.println(str);
        }
    }

    public void createNumber1_20Array() {
        for (int i = 0; i < 20; i++) {
            this.array1_20[i] = i + 1;
        }
    }

    public void printSquaredNumbers() {
        for (int i : this.array1_20) {
            int j = i * i;
            System.out.println(i + " Squared is " + j);
        }
    }

    public Boolean isEven(int number) {
        boolean isTrue;
        if (number%2 == 0) {
            isTrue = true;
        }
        else {
            isTrue = false;
        }

        return isTrue;
    }

    public void squareOrCube() {
        for (int i: this.array1_20) {
            if (isEven(i)) {
                int j = i * i * i;
                System.out.println(i + " is even, and cubed is " + j);
            }

            else {
                int k = i * i;
                System.out.println(k + " is odd, and squared is " + k);
            }
        }
    }
}
