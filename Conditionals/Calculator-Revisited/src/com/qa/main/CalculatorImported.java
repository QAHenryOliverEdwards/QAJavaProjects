package com.qa.main;

public class CalculatorImported {
	
	public double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
	
	public double subtraction(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}
	
	public double division(double num1, double num2) {
		double result = 0;
		if (num2 > num1) {
			System.out.print("Cannot Divide");
		}
		else {
			result = num1/num2;
		}
		return result;
	}
	
	public double multiplication(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
}
