package com.witstan.exer;

public class CheckAccount extends Account {
	
	private double overdraft;
	
	public CheckAccount (int id, double balance, double annualInterestRate ,double overdraft){
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	
	public double getOverdraft() {
		return overdraft;
	}


	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}


	@Override
	public void withdraw(double amount) {
		if(amount <= getBalance()){
			super.withdraw(amount);
		}else{
			if(amount > (getBalance() + overdraft)){
				System.out.println("超过可透支限额！");
			}else{
				overdraft -= amount - getBalance();
				setBalance(0);
			}
		}
		
		
	}
}
