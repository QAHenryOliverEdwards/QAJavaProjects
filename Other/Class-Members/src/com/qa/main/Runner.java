package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Henry", "Oliver-Edwards");
		Customer customer2 = new Customer("Joe", "Oliver-Welsh");
		
		
		System.out.println(customer1.getFirstName());
		System.out.println(customer2.getSurname());
		System.out.println(customer2.getNumberOfPeople());
	}

}
