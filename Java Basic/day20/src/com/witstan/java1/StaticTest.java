package com.witstan.java1;
/*
 * static关键字的使用
 * 
 * 1.static：指静态的
 * 2.static用来修饰类的结构：属性、方法、代码块、内部类
 * 
 * 3.使用static修饰属性：静态变量（类变量）
 * 		3.1 属性按是否使用static修饰，又分为：静态属性和非静态属性（实例变量）
 * 			实例变量：但创建了类的多个对象，每个对象都独立得拥有一套类中的非静态属性。
 * 				       当修改其中一个对象的非静态属性，不会导致其他对象中同样的属性值修改。
 * 			静态变量：当创建了类的多个对象，每个对象都共用一个静态变量。当通过某一个对象
 * 				       修改静态变量时，将导致其他对象调用静态变量时，是调用的修改过后的静态变量。
 * 		3.2 static修饰属性的其他说明：
 * 			① 静态变量随着类的加载而加载。可以用过“类.静态变量”的方式进行调用
 * 			② 静态变量的加载要遭遇对象的创建。
 * 			③ 由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中。
 * 
 * 			④ 		类变量	实例变量
 * 			类		yes		no
 * 			对象		yes		yes
 * 
 * 		3.3 静态属性举例：System.out; Math.PI
 * 
 * 4.使用static修饰方法：静态方法
 * 		① 随着类的加载而加载，可以通过“类.静态方法”的方法调用
 * 		② 		静态方法	非静态方法
 * 		类		yes		no
 * 		对象		yes		yes
 * 		③ 静态方法中只能调用静态的方法或属性
 *		      非静态方法中，既可以调用静态的方法或属性，也可以调用非静态的方法或属性
 *
 * 5.static注意点：
 * 		5.1 在静态的方法内，不能使用this关键字，也不能使用super关键字
 * 		5.2 关于静态属性和静态方法的使用，从生命周期的角度去理解
 * 
 * 6.在开发中，如何确定一个属性是否要声明为static？
 * 		> 属性可以被多个对象共享，不会随着对象的不同而不同
 * 		> 类中的常量也常常声明为static
 * 
 * 	   在开发中，如何确定一个方法是否要声明为static？
 * 		> 操作静态属性的方法，通常设置为static的
 * 		> 工具类中的方法，习惯上声明为static的。比如：Math/Array/Collections
 * 
 */
public class StaticTest {
	public static void main(String[] args) {
		
		Chinese.nation = "中国";
		
		Chinese c1 = new Chinese();
		c1.name = "张三";
		c1.age = 30;
		c1.nation = "CHN";
		
		Chinese c2 = new Chinese();
		c2.name = "李四";
		c2.age = 40;
		c2.nation = "China";
		
		//编译不通过
//		Chinese.name = "王五";
		
		System.out.println(c1.nation);
		
		Chinese.show();
		
		//编译不通过
//		Chinese.eat();
//		Chinese.info();
		
		
		
	}
}

class Chinese{
	String name;
	int age;
	static String nation;
	
	public void eat(){
		System.out.println("eat Chinese food");
		this.eat();
		System.out.println("name = " + name );
		walk();
		System.out.println(nation);
	}
	
	public static void show(){
		System.out.println("a Chinese");
		//不能调用非静态结构
//		eat();
//		name = "Tom";
		//可以调用非静态结构
		System.out.println(Chinese.nation);
		walk();
	}
	
	public void info(){
		System.out.println("name = " + name + ", age = " + age);
	}
	
	public static void walk(){
		
	}
}
