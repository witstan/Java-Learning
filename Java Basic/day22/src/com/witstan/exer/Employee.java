package com.witstan.exer;
/*
 * （1）定义一个Employee类，该类包含：
private成员变量name,number,birthday，其中birthday 为MyDate类的对象； 
abstract方法earnings()；
toString()方法输出对象的name,number和birthday。
 * 
 */
public abstract class Employee {

	private String name;
	private int number;
	private MyDate birthday;
	
	
	public Employee(){		
	}
	
	public Employee(String name, int number, MyDate birthday) {	
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	abstract public double earnings(int month);
	
	
	public String toString(int month) {
		return "[name=" + getName() + ", number=" + getNumber() + ", birthday=" + getBirthday().toDateString() + "]";
	}

	
	
	
}


