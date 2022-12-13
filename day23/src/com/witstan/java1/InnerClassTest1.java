package com.witstan.java1;

public class InnerClassTest1 {

	//开发中少见
	public void method(){
		//局部内部类
		class AA{
			
		}
	}
	
	public Comparable getComparable(){
		
		//创建一个实现了Comparable接口的类
		//方式一：
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//			
//		}
//		
//		return new MyComparable();
		
		//方式二
		
		return new Comparable(){
			@Override
			public int compareTo(Object o) {
				return 0;
			}
		};
		
	}
}
