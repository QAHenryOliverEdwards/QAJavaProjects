package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		BlackJack hand1 = new BlackJack();
		System.out.println(hand1.compare(10, 21));
		System.out.println(hand1.compare(20, 18));
		System.out.println(hand1.compare(1, 22));
		System.out.println(hand1.compare(22, 23));
	}

}
