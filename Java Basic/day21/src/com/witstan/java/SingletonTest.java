package com.witstan.java;

public class SingletonTest {
	public static void main(String[] args) {
			Bank b1 = Bank.instance;
//			Bank.instance = null;
			Bank b2 = Bank.instance;
			
			System.out.println(b1 == b2);
			
	
	}
}

class Bank{
	
	private Bank(){
		
	}
	
	public static final Bank instance = new Bank();
}
