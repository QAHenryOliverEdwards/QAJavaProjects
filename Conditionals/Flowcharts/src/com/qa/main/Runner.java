package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Flow1 myFlow = new Flow1();
		
		System.out.println(myFlow.numberMachine(1, 2, true));
		System.out.println(myFlow.numberMachine(3, 3, false));
		System.out.println(myFlow.numberMachine(1, 1, true));
		
		Flow2 myFlow2 = new Flow2();
		myFlow2.flowChart(2500);
		myFlow2.flowChart(6000);
		myFlow2.flowChart(1);
	}

}