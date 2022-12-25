package com.witstan.exer;
/*
 * 1.创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
 * 用 setAge()设 置 人 的 合 法 年 龄 (0~130)， 用 getAge()返 回 人 的 年 龄 。 
在 PersonTest 类 中实例化Person 类的对象b ， 调用setAge() 和 
getAge()方法，体会Java的封装性。
 * 
 * 2.练习2
 * 2.1在前面定义的Person类中添加构造器，利用构造器设置所有人的age属 性初始值都为18。
 * 2.2修改上题中类和构造器，增加name属性,使得每次创建Person对象的同 时初始化对象的age属性值和name属性值。
 */
public class Person {

	private int age;
	private String name;
	
	public Person(){
	}
	
	
	public Person(String s, int i){
		name = s;
		age = i;
	}
	
	public void setAge(int a){
		if(age < 0 || a > 130){
			System.out.println("传入数据非法");
			return;
		}
		age = a;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String s){
		name = s;
	}
	
	public String getName(){
		return name;
	}
}
