package com.witstan.exer;
/*
 * 2.编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别 
执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。

3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方 
法求两个double值中的最大值，第三个方法求三个double值中的最大值， 
并分别调用三个方法。
 * 
 */
public class OverloadExer {
	
	public static void main(String[] args) {
		
		OverloadExer exer = new OverloadExer();
		
		int i = exer.max(2, 8);
		System.out.println(i);
		
		double d = exer.max(24.8, 0.9);
		System.out.println(d);
		
		double d1 = exer.max(0.1, 2.1, 3.0);
		System.out.println(d1);
	}
	
	//1.如下方法构成重载
	public void mOL(int i){
		System.out.println(i * i);
	}
	
	public void mOL(int i, int j){
		System.out.println(i * j);
	}
	
	public void mOL(String s){
		System.out.println(s);
	}
	
	//2.
	public int max(int i, int j){
		return (i > j)? i : j;
	}
	
	public double max(double d1, double d2){
		return (d1 > d2)? d1 : d2;
	}
	
	public double max(double d1, double d2, double d3){
		return (d1 > d2)? ((d1 > d3)? d1 : d3):((d2 > d3)? d2 : d3);
	}
	
}
