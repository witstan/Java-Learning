package com.witstan.java3;

import java.sql.Date;

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
		
		System.out.println("***********************");
		
		p2.name = "Dave";
//		p2.isStrong = true;
//		p2.earnMoney(); //不能调用earnMoney()方法，编译时，p2是Person类型
		//有了对象的多态性后，内存中实际上加载了子类特有的属性和方法，但由于变量声明为父类类型，
		//导致编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。
		
		//如何才能调用子类特有的属性和方法？
		//向下转型：使用强制类型转换符
		Man m1 = (Man)p2;
		m1.isStrong = true;
		m1.earnMoney();
		
		//使用强转时，可能出现ClassCastException的异常。
//		Woman w = (Woman)p2;
//		w.goShopping();
		
		/*
		 * instanceof；
		 * 
		 * a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
		 * 
		 * 使用情景：为了避免在向下转型时出现ClassCastException的异常，在向下转型前先使用instanceof
		 * 进行判断，如果返回true则进行转型，返回false不进行转型。
		 * 
		 * 如果a instanceof A 返回true，则a instanceof B 也返回true。
		 * 
		 */
		
		if(p2 instanceof Woman){
			Woman w = (Woman)p2;
			w.goShopping();
			System.out.println("***Woman***");
		}
		
		if(p2 instanceof Man){
			Man m2 = (Man)p2;
			m2.earnMoney();
			System.out.println("***Man***");
		}
		
		if(p2 instanceof Person){
			System.out.println("***Person***");
		}
		
		if(p2 instanceof Object){
			System.out.println("***Object***");
		}
		
		//练习：
		//问题一：编译时通过，运行时不通过；
		Person p4 = new Woman();
		Man m3 =(Man)p4;
		
		//问题二：编译时通过，运行时也通过；
		Object o1 = new Woman();
		Person p5 = (Person)o1;
		
		//问题三：编译不通过；
//		Man m4 = new Woman();
		
//		String s = new Date();
		
//		Object o2 = new Date(0);
//		String s1 = (String)o2;
	
	}
}
