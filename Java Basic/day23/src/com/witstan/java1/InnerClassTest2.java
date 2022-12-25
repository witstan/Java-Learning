package com.witstan.java1;

public class InnerClassTest2 {
	/*
	 * 
	 * 在局部内部类的方法中（例如：show()）如果调用外部类内部所声明的方法（例如method()）中的
	 * 局部变量（比如：num），则要求此局部变量声明为final。
	 * 
	 * jdk 7及之前的版本：要求此局部变量显式声明为final的
	 * jdk 8及之后的版本：可以省略final的声明
	 * 
	 */
	public void method(){
		
		//局部变量
		int num = 1;
		
		class A{
			
			public void show(){
//				num = 2;
				System.out.println(num);
			}
		}
	}
}
