package com.qa.main;

public class Variables {
	
	// variables
	
	static int age = 22;
	static String name = "Henry";
	boolean myTrue = true;
	
	// Method for returning the age inside of the main method
	public static void getAge() {
		System.out.println(age);
	}
	
	// Another method for returning name inside of the main method
	public static String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		getAge();
		System.out.println(getName());
	}
}
