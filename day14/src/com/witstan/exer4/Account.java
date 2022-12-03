package com.witstan.exer4;

public class Account {
	
	private double balance;
	
	public Account(double init_balance){
		this.balance = init_balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double amt){
		if(amt < 0){
			System.out.println("invalid amount");
		}else{
			balance += amt;
		System.out.println("存款成功");
		System.out.println("本次存入：" + amt);
		}
	}
	
	public void withdraw(double amt){
		if(amt > balance){
			System.out.println("invalid amount");
		}else{
			balance -= amt;
		System.out.println("取款成功");
		System.out.println("本次取出：" + amt);
		}
	}
}
