package com.witstan.exer3;

public class Account {
	
	private int id;//账号
	private double balance;//余额
	private double annualInterestRate;//年利率
	
	public Account (int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance += balance;
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
	
	public void withdraw(double amount){//取钱
		if(this.balance >= amount){
			this.balance -= amount;
			//this.setBalance(getBalance() - amount);
			System.out.println("成功取出：" + amount);
		}else{
			System.out.println("余额不足，取款失败。");
		}
	}
	
	public void deposit (double amount){//存钱
		if(amount > 0){
		this.balance += amount;
		System.out.println("成功存入：" + amount);
		}
	}
	
	public String getAccountInfo(Customer c) {
		return "Custorm [" + c.getLastName() + ", " +c.getFirstName() + "] has an account: id is " + this.id + ", annualInterestRate is " + this.annualInterestRate*100 + "%, balance is " + this.balance;
	}
	
	
}
