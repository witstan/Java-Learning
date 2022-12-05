package com.witstan.java;
/*
 * 面向对象的特征之二：继承性
 * 
 * 一、继承性的优势
 * ① 减少代码冗余，提高代码复用性
 * ② 便于功能扩展
 * ③ 为之后多态性的使用提供前提
 * 
 * 二、继承性的格式：
 * 		class A extends B{}
 * 		A:子类、派生类、subclass
 * 		B：父类、超类、基类、superclass
 * 
 * 		体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的所有的属性、方法
 * 		特别的：父类中声明为私有的属性和方法，子类继承父类后，依然获得了父类中私有的结构
 * 		只是因为封装性的影响，使得子类不能直接调用父类的结构而已。
 * 
 * 		子类继承父类以后，还可以声明自己特有的属性或方法，实现功能拓展。
 * 		子类和父类的关系，不同于子集和集合的关系。
 * 
 * 三、java中关于继承性的规定：
 * 		1.一个类可以被多个子类继承。
 * 		2.java中类的单继承性：一个类只能有一个父类
 * 		3.子子父类是相对概念。
 * 		4.子类直接继承的父类称为：直接父类。简介继承的父类成为：间接父类
 * 		5.子类继承父类之后，则获取直接父类以及所有间接父类的属性和方法
 * 
 * 四、	1.如果没有显式地声明一个类的父类，则此类继承于java.lang.Object类
 *   	2.所有的java类（除java.lang.Object)都直接或间接继承于java.lang.Object
 *   	3.意味着所有的java类都具有java.lang.Object类声明的功能。
 */
public class ExtendsTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
//		p1.age = 1;
		p1.eat();
		
		System.out.println("***********");
		
		Student s1 = new Student();
		s1.eat();
//		s1.sleep();
		s1.name = "Noah";
		
		s1.setAge(10);
		System.out.println(s1.getAge());
		
		s1.breath();
		
		Creature c = new Creature();
		
		
	}
}
