package com.qa.main;

public class UniqueSum {

    double totalSum = 0;

    public double evalSum(double num1, double num2, double num3) {
        if (num1 != num2) {
            totalSum += num1;
        }
        if ((num1 != num2) && (num2 != num3)) {
            totalSum += num2;
        }
        if (num2 != num3) {
            totalSum += num3;
        }

        return totalSum;
    }
}
