package com.witstan.java;

public class ValueTransferTest {
	public static void main(String[] args) {
		
		String s1 = "hello";
		
		ValueTransferTest test = new ValueTransferTest();
		test.str(s1);
		System.out.println(s1);
	}
	
	public void str(String s){
		s = "hi";
	}
}
