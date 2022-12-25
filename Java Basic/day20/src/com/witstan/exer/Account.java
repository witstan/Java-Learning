package com.witstan.exer;
/*
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密 码”、“存款余额”、
 * “利率”、“最小余额”，定义封装这些属性的方法。账号要自动生成。
 * 
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 *  
 * 考虑：哪些属性可以设计成static属性。
 * 
 */
public class Account {
	
	private int id;
	private String password;
	private double balance;
	private static int initId = 1001;//用于自动生成id
	private static double interestRate;
	private static double minBalance;
	
	public Account(){
		this.id = initId++;
	}
		
	public Account(String password, double balance) {
		this();
		this.password = password;
		this.balance = balance;
		
	}



	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}
	public static double getMinBalance() {
		return minBalance;
	}
	public static void setMinBalance(double minBalance) {
		Account.minBalance = minBalance;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", password=" + password + ", balance=" + balance + "]";
	}

	
	
	
}
