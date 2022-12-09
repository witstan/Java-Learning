package com.witstan.java2;

public class MainDemo {

	public static void main(String[] args) {
		
		for(int i = 0;i < args.length;i++){
			System.out.println("*****" + args[i]);
			
			int i1 = Integer.parseInt(args[i]);
			System.out.println("###" + i1);
		}
	}
}
