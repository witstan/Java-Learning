package com.witstan.java;
/*
 * 面向对象的特征一：封装与隐藏
 * 一、问题的引入：
 * 	当创建一个类的对象后，可以通过“对象.属性”的方式，对对象的属性进行赋值。赋值操作
 * 受到属性的数据类型和存储范围的制约。除此之外没有其他限制条件。但是在实际问题中，往往
 * 需要给属性赋值加入额外的限制条件。这个条件就不能在属性声明时体现，只能通过方法进行限制条件的添加。如setLegs()
 * 同时，需要避免用户再使用“对象.属性”的方式对属性进行赋值。则许哟啊将属性声明为私有的（private）。
 * -->此时，针对于属性就体现了封装性。
 * 
 * 二、封装性的体现：
 * 将类的属性私有化（private），同时，提供公共的（public）的方式来获取（getXxx）和设置（setXxx）此属性的值。
 * 
 * 	拓展：封装化的体现：①如上 ②不对外暴露的私有的方法 ③单例模式……
 * 
 * 三、封装性的体现需要权限修饰符配合。
 * 1.java提供的4种权限（从小到大）：private、缺省、protected、public
 * 2.4种权限修饰符可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 * 3.具体的，4种权限修饰符都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 * 		       修饰类只能使用：public、缺省
 * 
 * 总结封装性：jav提供4种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性大小。
 */
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "大黄";
		//a.age = 1;
		//a.legs = 4;//The field Animal.legs is not visible
		
		a.show();
		
		
		//a.legs = -4;
		a.setLegs(6);
		a.setLegs(-4);
		
		
		//a.legs = -4;//The field Animal.legs is not visible
		a.show();
		
		
		
	}
}


class Animal{
	
	String name;
	private int age;
	private int legs;
	
	//对属性的设置
	public void setLegs(int l){
		if(l >= 0 && l % 2 == 0){
			legs = l;
		}else{
			legs = 0;
			//抛出一个异常（后面讲）
		}
	}
	
	//对属性的获取
	public int getlegs(){
		return legs;
	}
	
	
	//提供关于属性age的get和set的方法
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int i){
		if(i < 0){
			age = 0;
		}else{
			age = i;
		}
	}
	
	public void eat(){
		System.out.println("动物进食");
	}
	
	public void show(){
		System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
	}
	
}