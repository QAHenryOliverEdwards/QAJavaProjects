package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Counter myCounter = new Counter();
		while (myCounter.getCount() > 1) {
			switch(myCounter.getCount()) {
				default:
					System.out.println(myCounter.getCount() + " Bottles of Beer on the wall, " + myCounter.getCount() + " Bottles of beer");
					System.out.println();
					System.out.println("\n");
					System.out.println("Take one down and pass it around,");
					myCounter.decrease();
					System.out.println(myCounter.getCount() + " Bottles of Beer on the wall");
					
			}
		}
	}
}
