package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Coins costOfSomething = new Coins(55.55, 150);
		System.out.println(costOfSomething.cashback);
		System.out.println(costOfSomething.returnCoins());
	}
	
}
