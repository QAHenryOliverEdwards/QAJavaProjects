package com.qa.main;

public class Taxes {

    double salary;
    double taxPerc;

    public Taxes (double salary) {
        this.salary = salary;
    }

    public void taxCalc() {
        if (this.salary <= 14999) {
            taxPerc = 0;
        }
        else if ((this.salary >= 1500) && (this.salary <= 19999)) {
            taxPerc = 10;
        }
        else if ((this.salary >= 20000) && (this.salary <= 29999)) {
            taxPerc = 15;
        }
        else if ((this.salary >= 30000) && (this.salary <= 44999)) {
            taxPerc = 20;
        }
        else if (this.salary >= 45000) {
            taxPerc = 25;
        }
    }
    
    public double taxCalcReturn() {
        if (this.salary <= 14999) {
            taxPerc = 0;
        }
        else if ((this.salary >= 1500) && (this.salary <= 19999)) {
            taxPerc = 10;
        }
        else if ((this.salary >= 20000) && (this.salary <= 29999)) {
            taxPerc = 15;
        }
        else if ((this.salary >= 30000) && (this.salary <= 44999)) {
            taxPerc = 20;
        }
        else if (this.salary >= 45000) {
            taxPerc = 25;
        }
        
        return taxPerc;
    }
}
