package com.witstan.exer4;

public class Bank {
	
	private Customer[] customers;
	private int numberOfCustomer;
	
	public Bank(){
		customers = new Customer[10];
	}
	
	public void addCustomer(String f, String l){
		numberOfCustomer ++;
		customers[numberOfCustomer - 1] = new Customer(f, l);
		
	}
	
	public int getNumOfCustomer(){
		return numberOfCustomer;
	}
	
	public Customer getCustomer(int index){
		if(index >= 0 && index < numberOfCustomer){
			return customers[index];
		}
		return null;
	}
}
