package com.qa.main;

public class ArrayClass {
		 
	public void OneToTen() {
		
		int[] my1to10 = new int[10];
		
		for (int i = 1; i <= 10; i++) {
			my1to10[i - 1] = i;
		}
		for (int i : my1to10) {
			System.out.println(i);
		}
	}
}
