package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		BasicAddition myAdder = new BasicAddition();
		System.out.println(myAdder.basicAddition(5, 7));
		
		BasicCalculator myCalc = new BasicCalculator();
		System.out.println(myCalc.add(10, 20));
		System.out.println(myCalc.subtraction(20, 10));
		System.out.println(myCalc.division(10, 5));
		System.out.println(myCalc.multiplication(5, 5));
	}

}
