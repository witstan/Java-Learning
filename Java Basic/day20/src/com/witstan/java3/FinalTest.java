package com.witstan.java3;
/*
 * final
 * 
 * 1. final可以用来修饰的结构：类、方法、变量
 * 
 * 2. final 修饰类：此类不能被其他类继承
 * 			例如：String类、System类、StringBuffer类
 * 
 * 3. final 修饰方法：此方法不能再被重写
 * 			比如：Object类中的getClass();
 * 
 * 4. final 修饰变量：此时的“变量”就称为一个常量
 * 		4.1 final修饰属性：可以考虑赋值的位置有：显式初始化、代码块中赋值、构造器中初始化 
 * 		4.2 final修饰局部变量:
 * 			尤其时使用final修饰形参时，表明此形参时一个常量。当调用此方法时，给常量形参赋一个实参。
 * 			一旦赋值，就只能在方法体内使用此形参，但不能重新赋值
 * 
 * 	static final 用来修饰属性：全局常量
 * 
 */
public class FinalTest {
	
	final int WIDTH = 10;
	final int LEFT;
	final int RIGHT;
//	final int DOWN;
	
	{
		LEFT = 1;
	}
	
	public FinalTest(){
		RIGHT = 2;
	}
	
	public FinalTest(int n){
		RIGHT = n;
	}
	
//	public void setDown(int down){
//		this.DOWN = down;
//	}
	
	
	public void setWidth(int width){
//		this.width = width;
	}
	
	public void show(){
		final int NUM = 10;
//		NUM += 10;
	}
	
	public void show(final int NUM){
//		NUM = 20;
		System.out.println(NUM);
	}
	
	public static void main(String[] args) {
		FinalTest test = new FinalTest();
//		test.setDown(3);
		test.show(3);
		
	}
}

final class FinalA{
	
}

//class B extends FinalA{
//	
//}

//class B extends String{
//	
//}

class AA{
	final void show(){
		
	}
}

class BB extends AA{
//	void show(){	
//	}
}