package com.witstan.exer3;

public class CustomerAccountTest {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Jane","Smith");
		Account acc1 = new Account(1000, 2000.0, 0.0123);
		
		c1.setAccount(acc1);

		c1.getAccount().deposit(100.0);
		
		c1.getAccount().withdraw(960.0);
		
		c1.getAccount().withdraw(2000.0);
		
		System.out.println(c1.getAccount().getAccountInfo(c1));
	}
}
