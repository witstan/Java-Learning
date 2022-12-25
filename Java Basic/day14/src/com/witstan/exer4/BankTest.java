package com.witstan.exer4;

public class BankTest {
	public static void main(String[] args) {
		
		Bank b0 = new Bank();
		
		
		b0.addCustomer("Jane", "Doe");

		b0.getCustomer(0).setAccount(new Account(2000));
		double balance = b0.getCustomer(0).getAccount().getBalance();
		System.out.println("客户 " + b0.getCustomer(0).getFirstName() + " " +b0.getCustomer(0).getLastName() + " 的账户余额为：" + balance );
	
		
		
		b0.addCustomer("Joe", "Biden");
		b0.addCustomer("Donald", "Trump");
		
		
		//System.out.println(b1.getNumOfCustomer());
		
		b0.getCustomer(0).getAccount().deposit(200);
		b0.getCustomer(0).getAccount().deposit(430);
		b0.getCustomer(0).getAccount().withdraw(130);
		
		double balance1 = b0.getCustomer(0).getAccount().getBalance();
		System.out.println("客户 " + b0.getCustomer(0).getFirstName() + " " +b0.getCustomer(0).getLastName() + " 的账户余额为：" + balance1 );
	
		System.out.println("银行现有客户：" + b0.getNumOfCustomer() + "名。");
	
	}
}
