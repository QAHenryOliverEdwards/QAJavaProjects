package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		StudentGradesImported student1 = new StudentGradesImported(100, 20, 60);
		StudentGradesImported student2 = new StudentGradesImported(100, 100, 100);
		StudentGradesImported student3 = new StudentGradesImported(75, 46, 87);
		
		System.out.println(student1.passOrFail("physics"));
		System.out.println(student2.passOrFail("biology"));
		System.out.println(student3.passOrFail("chemistry"));
		
		student1.overAllGrades();
		student2.overAllGrades();
		student3.overAllGrades();

	}

}
