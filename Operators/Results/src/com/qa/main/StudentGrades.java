package com.qa.main;

public class StudentGrades {
	
	double physics;
	double chemistry;
	double biology;
	double totalScore;
	
	public StudentGrades(double physics, double chemistry, double biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.totalScore = (physics + chemistry + biology);
	}
	
	public void displayGrades() {
		System.out.println("Physics Grade: " + this.physics);
		System.out.println("Chemistry Grade: " + this.chemistry);
		System.out.println("Biology Grade: " + this.biology);
		System.out.println("Total Grade: " + this.totalScore);
	}
	
	public double findPercent() {
		double result = (double) ((totalScore/450)*100);
		System.out.println("Your total exam percentage is:" + result);
		return result;
	}
}
