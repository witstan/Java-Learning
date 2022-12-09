package com.witstan.exer;

public class AccountTest {
	public static void main(String[] args) {
		
		Account a1 = new Account();
		Account a2 = new Account("000000", 1000.00);
		
		a1.setPassword("231234");
		Account.setInterestRate(0.0123);
		Account.setMinBalance(200.00);
		
		System.out.println("Account利率为：" + Account.getInterestRate()*100 + "%");
		System.out.println("Account最小余额为：" + Account.getMinBalance());
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}
}
