package com.qa.main;

public class Runner {
	
	// Variables
	
	static String name = "Henry";
	static int age = 22;
	
	// Setters and getters for names
	
	public static void setName(String newName) {
		name = newName;
	}
	
	public static String getName() {
		return name; 
	}
	
	public static void setAge(int newAge) {
		age = newAge;
	}
	
	public static int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		System.out.println(getName());
		setName("Henno");
		System.out.println(getName());
		System.out.println(getAge());
		setAge(55);
		System.out.println(getAge());
	}

}
