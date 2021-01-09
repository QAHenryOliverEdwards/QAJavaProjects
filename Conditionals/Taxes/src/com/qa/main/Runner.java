package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Taxes myTax = new Taxes(1);
		Taxes myTax2 = new Taxes(35000);
		Taxes myTax3 = new Taxes(50000);
		
		System.out.println(myTax.taxCalcReturn());
		System.out.println(myTax2.taxCalcReturn());
		System.out.println(myTax3.taxCalcReturn());
	}

}
