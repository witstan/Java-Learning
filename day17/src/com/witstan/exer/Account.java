package com.witstan.exer;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account(){
		
	}
	
	public Account (int id, double balance, double annualInterestRate ){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterest(){
		return this.annualInterestRate / 12;
	}
	
	public void withdraw (double amount){
		if(amount > balance || amount < 0){
			System.out.println("余额不足！");
			return;
		}
		balance -= amount;
	}
	
	public void deposit (double amount){
		if(amount < 0){
			return;
		}
		balance += amount;
	}
	
	
}
