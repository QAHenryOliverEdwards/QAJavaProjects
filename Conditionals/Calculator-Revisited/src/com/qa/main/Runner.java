package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		CalculatorImported myCalc = new CalculatorImported();
		System.out.println(myCalc.division(10, 5));
		System.out.println(myCalc.division(5, 10));
	}

}
