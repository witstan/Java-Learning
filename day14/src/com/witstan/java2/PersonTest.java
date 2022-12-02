package com.witstan.java2;
/*
 * this关键字的使用：
 * 1. this可以修饰：属性、方法、构造器
 * 
 * 2. this修饰属性：
 * 		this理解为:当前对象
 * 		
 * 	2.1	在类的方法中，可以使用“this.属性”或“this.方法”的方式调用当前对象属性或方法。
 * 		但是通常情况下，选择省略“this.”。特殊情况下，如果方法的形参和类的属性同名时，我们必须显式的使用
 * 		“this.变量”的方法，表明此变量是属性，而非形参。
 * 
 * 	2.2	在类的构造器中，可以使用“this.属性”或“this.方法”的方式调用当前正在创建的对象属性或方法。
 * 		但是通常情况下，选择省略“this.”。特殊情况下，如果构造器的形参和类的属性同名时，我们必须显式的使用
 * 		“this.变量”的方法，表明此变量是属性，而非形参。
 * 
 * 3.this调用构造器
 * 		① 我们在类的构造器中，可以显式的使用“this（形参列表）”，调用本类中指定的其他构造器
 * 		② 构造器中不能通过“this（形参）”调用自己本身。
 * 		③ 如果一个类中有n个构造器，则最多有n-1个构造器中使用了“this（形参列表）”
 * 		④ 规定：“this（形参列表）”必须声明在构造器内部的首行
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setAge(1);
		System.out.println(p1.getAge());
		
		p1.eat();
		
		System.out.println();
		
		Person p2 = new Person("Tom" , 12);
		System.out.println(p2.getAge());
		
		
	}
}

class Person{
	
	private String name;
	private int age;
	
	public Person(){
		//this.eat();
		String info = "//Person初始化时需要考虑如下的1，2，3，4……（共40行代码）";
		System.out.println(info);
	}
	

	
	public Person(String name){
		this();
		this.name = name;
	}
	
	public Person(int age){
		this();
		this.age = age;
	}
	
	public Person(String name, int age){
		this(age);
		this.name = name;
		//this.age = age;
		//Person初始化时需要考虑如下的1，2，3，4……（共40行代码）
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void eat(){
		System.out.println("eat");
		this.sleep();
	}
	
	public void sleep(){
		System.out.println("sleep");
	}
}