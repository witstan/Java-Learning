package com.witstan.exer;
/*
 * 在 PersonTest 类 中实例化Person 类的对象b ， 
 * 调用setAge() 和 getAge()方法，体会Java的封装性。
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		//p1.get = 1;//编译不通过
		p1.setAge(45);
		
		System.out.println("年龄为：" + p1.getAge());
		
		
		Person p2 = new Person("Tom", 32);
		
		System.out.println("name = " + p2.getName() + ", age = " + p2.getAge());
	}
}
