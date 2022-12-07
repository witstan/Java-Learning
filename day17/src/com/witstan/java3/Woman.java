package com.witstan.java3;

public class Woman extends Person {
	
	boolean isBeautiful;
	
	public void goShopping(){
		System.out.println("go shopping");
	}
	
	@Override
	public void eat() {
		System.out.println("eat less");
	}
	
	public void walk(){
		System.out.println("shorter stride length");
	}
}
