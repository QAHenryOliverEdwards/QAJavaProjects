package com.qa.main;

public class Flow1 {
	
	public double numberMachine(double num1, double num2, boolean isTrue) {
		
		double result = 0;
		
		if (isTrue) {
			result = num1 + num2;
		}
		
		else if (isTrue == false) {
			result = num1 * num2;
		}
		return result;
	}
}
