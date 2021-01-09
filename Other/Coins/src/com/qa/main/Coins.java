package com.qa.main;

public class Coins {
	
	double cost;
	double payment;
	double cashBack;
	
	double note10 = 10;
	double note5 = 5;
	double p20 = 0.20;
	double p2 = 0.02;
	double p1 = 0.01;
	
	int note10Counter = 0;
	int note5Counter = 0;
	int p20Counter = 0;
	int p2Counter = 0;
	int p1Counter = 0;
	
	double cashback;
	
	public Coins (double cost, double payment) {
		this.cost = cost;
		this.payment = payment;
		this.cashback = (payment - cost);
	}
	
	// cost = 55.55, payment = 150, cashback 94.45
	
	public String returnCoins() {
		String output = "";
		int tenResult = (int) this.cashback / 10;
		this.cashback -= 10 * tenResult;
		int fiveResult = (int) this.cashback / 5;
		this.cashback -= 5 * fiveResult;
		double p20Result = (double) this.cashback / 0.2;
		this.cashback -= 0.2 * Math.floor(fiveResult);
		double p2Result = (double) this.cashback / 0.02;
		this.cashback -= 0.02 * Math.floor(p2Result);
		double p1Result = (double) this.cashback / 0.01;
		this.cashback -= 0.01 * Math.floor(fiveResult);
		output += "£10 returned =" + tenResult + "\n";
		output += "£5 returned =" + fiveResult + "\n";
		output += "20p's returned =" + Math.floor(p20Result) + "\n";
		output += "2p's returned =" + tenResult + "\n";
		output += "1p's returned =" + fiveResult + "\n";
		return output;
		}
	}




	

