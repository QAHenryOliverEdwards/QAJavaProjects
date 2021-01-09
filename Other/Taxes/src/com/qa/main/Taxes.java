package com.qa.main;

public class Taxes {
	
	double Salary;
	double taxPercent;
	
	public Taxes (double Salary) {
		this.Salary = Salary;
	}
	
	public void calcTaxes() {
		if (this.Salary <= 14999) {
			taxPercent = 0;
		}
		
		else if ((15000 < this.Salary) && (this.Salary > 19000)) {
			taxPercent = 10;
		}
		
		else if ((20000 < this.Salary) && (this.Salary > 29999)) {
			taxPercent = 15;
		}
		
		else if ((30000 < this.Salary) && (this.Salary > 44999)) {
			taxPercent = 20;
		}
		
		else if (this.Salary >= 45000) {
			taxPercent = 25;
		}
	}
}
