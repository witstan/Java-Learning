package com.witstan.java;
/*
 * 面向对象特征之三：多态性
 * 
 * 1.理解多态性：理解为一个事物的多种形态。
 * 2.什么是多态性：
 * 	   对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 * 
 * 3.多态的使用：虚拟方法调用
 * 	有了对象的多态性后，在编译期，只能调用父类中声明的方法，但在运行期，实际运行的是子类中重写父类的方法。
 * 
 * 4.多态性的使用前提： ① 类的继承关系 ② 方法的重写
 * 
 * 5.对象的多态性：只适用于方法，不适用于属性（编译和运行都看左边）
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.eat();
		
		Man m = new Man();
		m.eat();
		m.earnMoney();
		m.walk();
		m.age = 34;
		
		//**************************************
		System.out.println("***********************");
		//对象的多态性：父类的引用指向子类的对象
		Person p2 = new Man();	
		Person p3 = new Woman();
		
		//多态的使用：当调用子父类同名同参数的方法时，执行的是子类重写父类的方法 --- 虚拟方法调用
		p2.eat();
		p2.walk();
		
		//p2.earnMoney();
	
	}
}
