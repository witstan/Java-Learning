package com.witstan.java3;

/*
 * 类的成员之四：代码块（或初始化块）
 * 
 * 1. 代码块的作用：用来初始化类、对象
 * 2. 代码块如果有修饰，只能使用static
 * 3. 分类：静态代码块 vs 非静态代码块
 * 
 * 4.静态代码块
 * 		>内部可以有执行语句
 * 		>随着类的加载而执行，且只执行一次
 * 		>作用：在类加载的社会，初始化类的信息
 * 		>如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 		>静态代码块的执行优先于非静态代码块执行
 * 		>静态代码块内只能调用静态的属性、方法，不能调用非静态的结构
 * 		
 * 
 * 5.非静态代码块
 * 		>内部可以有执行语句
 * 		>随着对象的创建而执行
 * 		>每创建一个对象，就执行一次
 * 		>作用：可以在创建对象时，对对象的属性进行初始化
 * 		>非静态代码块内可以调用静态的属性、方法，也可以调用非静态的属性、方法
 * 		
 * 		
 * 对属性赋值的位置：
 * ①默认初始化
 * ②显式初始化
 * ③构造器中初始化
 * ④创建对象后，通过“对象.属性”或“对象.方法”的方式进行赋值
 * ⑤在代码块中初始化
 * 
 */
public class BlockTest {
	public static void main(String[] args) {

		String s = Person.descr;
		System.out.println(s);
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.age);

		Person.info();
	}
}

class Person {

	// 属性
	String name;
	int age;
	static String descr = "a person";

	// 构造器
	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// static代码块
	static {
		System.out.println("hello static block-1");

		// 调用静态结构
		descr = "an ordinary person";
		info();

		// 调用非静态结构
		// eat();
		// age = 1;

	}
	static {
		System.out.println("hello static block-2");
	}

	// 非static的代码块
	{
		System.out.println("hello block-1");
		
		// 调用静态结构
		descr = "an ordinary person";
		info();

		// 调用非静态结构
		eat();
		age = 1;
		name = "Tom";
	}
	{
		System.out.println("hello block-2");
	}

	// 方法
	public void eat() {
		System.out.println("eat");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void info() {
		System.out.println("also a person");
	}

}
