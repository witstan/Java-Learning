package com.witstan.java2;

public class Student extends Person {

	String major;
	int id = 2002;// 学号

	public Student() {

	}

	public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
	}

	public Student(String major) {
		this.major = major;
	}

	public void eat() {
		System.out.println("eat more");
	}

	public void study() {
		System.out.println("student studys");
		eat();
		super.eat();
	}

	public void show() {
		System.out.println("name = " + this.name + ", age = " + super.age);
		System.out.println("id = " + id);
		System.out.println("id = " + super.id);
	}
}
