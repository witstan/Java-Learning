package com.witstan.exer;
/*
 * 写一个用户程序测试 Account 类。在用户程序中，创建一个账号为 1122、余额为  20000、 
年利率 4.5%的 Account 对象。使用 withdraw 方法提款  30000 元，并打印余额。
再使用 withdraw 方法提款 2500 元，使用 deposit 方法存款  3000 元，然后打印余额和月利 
率。
 * 
 * 写一个用户程序测试  CheckAccount 类。在用户程序中，创建一个账号为  1122、余 
额为 20000、年利率 4.5%，可透支限额为 5000 元的  CheckAccount 对象。
使用 withdraw 方法提款  5000 元，并打印账户余额和可透支额。 
再使用 withdraw 方法提款 18000 元，并打印账户余额和可透支额。 
再使用 withdraw 方法提款 3000 元，并打印账户余额和可透支额。
 * 
 */
public class AccountTest {
	public static void main(String[] args) {
		
		Account a1 = new Account(1122, 20000, 0.045);
		a1.withdraw(30000);
		System.out.println("您的账户余额为：" + a1.getBalance());
		
		System.out.println();
		
		a1.withdraw(2500);
		a1.deposit(3000);
		
		System.out.println("您的账户余额为：" + a1.getBalance());
		System.out.println("月利率为： " + a1.getMonthlyInterest());		
		
		System.out.println("***************************");
		
		CheckAccount c1 = new CheckAccount(1122, 20000, 0.045, 5000);
		
		c1.withdraw(5000);
		System.out.println("您的账户余额为：" + c1.getBalance());
		System.out.println("您的可透支额度为：" + c1.getOverdraft());
		
		c1.withdraw(18000);
		System.out.println("您的账户余额为：" + c1.getBalance());
		System.out.println("您的可透支额度为：" + c1.getOverdraft());
		
		c1.withdraw(3000);
		System.out.println("您的账户余额为：" + c1.getBalance());
		System.out.println("您的可透支额度为：" + c1.getOverdraft());
		
		
	}
}
