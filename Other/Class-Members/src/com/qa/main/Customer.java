package com.qa.main;

public class Customer {
	
	private String firstName;
	private String surname;
	static int numberOfPeople = 0;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public Customer(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
		numberOfPeople++;
	}
}
