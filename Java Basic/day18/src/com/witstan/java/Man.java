package com.witstan.java;

public class Man extends Person {
	
	boolean isStrong;
	int id = 2002;
	
	public void earnMoney(){
		System.out.println("to support family");
	}
	
	@Override
	public void eat() {
		System.out.println("eat more");
	}
	
	public void walk(){
		System.out.println("longer stride length");
	}
}
