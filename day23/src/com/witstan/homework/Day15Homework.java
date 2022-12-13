package com.witstan.homework;
/*
 * 声明抽象类，并包含抽象方法。测试类中创建一个继承抽象类的匿名子类的对象
 * 
 * 如何创建静态成员内部类和非静态成员内部类的对象？
 * 
 */
public class Day15Homework {
	public static void main(String[] args) {
		
		
		AbClass a = new AbClass(){

			@Override
			public void method() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
		
		
		AA.BB bb = new AA.BB();
		
		AA aa = new AA();
		AA.CC cc = aa.new CC();
	}
}

/*
 * 声明抽象类，并包含抽象方法。测试类中创建一个继承抽象类的匿名子类的对象
 * 
 */
abstract class AbClass{
	
	public abstract void method();
}


//******************************************


class AA{
	
	public static class BB{
		
	}
	
	class CC{
		
	}
	
}













