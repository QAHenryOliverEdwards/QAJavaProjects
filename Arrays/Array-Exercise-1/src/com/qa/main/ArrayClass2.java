package com.qa.main;

import java.util.ArrayList;

public class ArrayClass2 {
	
	ArrayList<Object> myArray = new ArrayList<>();
	
	public void myArrayList(int size) {
		for(int i = 0; i <= size; i++) {
			myArray.add(i);
			System.out.println(i);
		}
	}
	
	public void timesBy10() {
		for (Object i: myArray) {
			String j = i.toString();
			int k = Integer.valueOf(j);
			int a = k * 10;
			i = a;
			System.out.println(i);
		}
	}
	
}
