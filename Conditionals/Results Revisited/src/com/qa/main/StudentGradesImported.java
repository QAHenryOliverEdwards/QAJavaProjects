package com.qa.main;

public class StudentGradesImported {
	
	double physics;
	double chemistry;
	double biology;
	double totalScore;
	double physicsPercent;
	double chemistryPercent;
	double biologyPercent;
	double totalPercent;
	double avgGrade;

	
	public StudentGradesImported(double physics, double chemistry, double biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.totalScore = (physics + chemistry + biology);
		this.physicsPercent = this.calculatePercentage(physics);
		this.chemistryPercent = this.calculatePercentage(chemistry);
		this.biologyPercent = this.calculatePercentage(biology);
		this.totalPercent = (this.physicsPercent + this.chemistryPercent + this.biologyPercent);
		this.avgGrade = this.totalPercent/3;
		
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
	
	public double calculatePercentage(double grade) {
		double result = (double) ((grade/150)*100);
		return result;
	}
	
	public String passOrFail(String subject) {
		String output = "Didn't fail";
		if (subject == "biology" && this.biology < 60) {
			output = "Failed Biology";
		}
		
		if (subject == "chemistry" && this.chemistry < 60) {
			output = "Failed Chemistry";
		}
		
		if (subject == "physics" && this.physics < 60) {
			output = "Failed Physics";
		}
		return output;
	}
	
	public void overAllGrades() {
		System.out.println("Your average grade was: " + this.avgGrade + "%");
		if (this.physicsPercent > 60 && this.chemistryPercent > 60 && this.biologyPercent > 60) {
			System.out.println("You passed all subjects");
		}
		if (this.physicsPercent < 60) {
			System.out.println("You failed physics with a percent of: " + this.physicsPercent);
		}
		
		if (this.chemistryPercent < 60) {
			System.out.println("You failed chemistry with a percent of: " + this.chemistryPercent);
		}
		
		if (this.biologyPercent < 60) {
			System.out.println("You failed biology with a percent of: " + this.biologyPercent);
		}
		
	}
}
