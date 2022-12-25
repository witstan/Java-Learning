package com.witstan.java;
/*
 * 抽象类的匿名子类
 * 
 * 
 */
public class PersonTest {

	public static void main(String[] args) {
		
		method(new Student());//匿名对象
		
		Graduate g1 = new Graduate();
		method1(g1);//非匿名的类非匿名的对象
		
		method1(new Graduate());//非匿名的类匿名的对象
		
		//创建了一匿名子类的对象
		Person p = new Person(){

			@Override
			public void eat() {
				System.out.println("eat fast");
			}

			@Override
			public void walk() {
				System.out.println("walk fast");
				
			}
			
		};
		
		method1(p);
		System.out.println("*******");
		
		//创建匿名子类的匿名对象
		
		method1(new Person(){

			@Override
			public void eat() {
				System.out.println("eat slow");
				
			}

			@Override
			public void walk() {
				System.out.println("walk slow");				
			}
			
		});
		
		
		
		
	}
	
	public static void method1(Person p){
		p.eat();
		p.walk();
	}
	
	public static void method(Student s){
		
	}
}

abstract class Person{
	String name;
	int age;
	
	public Person(){
	}
	
	public Person(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}
	
	public abstract void eat();
	
	public abstract void walk();
}

class Student extends Person{
	
	public Student(){
		
	}
	public void eat(){
		System.out.println("eat");
	}
	
	@Override
	public void walk() {
		System.out.println("walk");
	}
}

class Graduate extends Student{
	
	public Graduate(){
	}
	
	@Override
	public void eat() {
		System.out.println("eat more");
	}
}


