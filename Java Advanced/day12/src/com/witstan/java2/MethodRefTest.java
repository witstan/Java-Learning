package com.witstan.java2;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用的使用
 *
 * 1. 使用情景：当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
 * 2. 方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数式接口的实例。
 * 所以方法引用也是函数式接口的实例。
 *
 * 3. 使用格式：类（或对想想）:: 方法名
 *
 * 4. 具体分为如下三种情况：
 * 	情况1	对象 :: 非静态方法（实例方法）
 * 	情况2	类 :: 静态方法
 * 	情况3	类 :: 非静态方法
 *
 * 5. 方法引用的使用要求：要求接口中的抽象方法的形参列表和返回值类型
 *    与方法引用的方法的形参列表和返回值相同。（针对于情况1和2）
 *
 * Created by shkstart.
 */
public class MethodRefTest {

	// 情况一：对象 :: 实例方法
	//Consumer中的void accept(T t)
	//PrintStream中的void println(T t)
	@Test
	public void test1() {

		Consumer<String> con = s -> System.out.println(s);
		con.accept("abc");

		System.out.println("************");

		PrintStream ps = System.out;
		Consumer<String> con1 = ps::println;
		con1.accept("123");

	}
	
	//Supplier中的T get()
	//Employee中的String getName()
	@Test
	public void test2() {
		Employee e1 = new Employee(1001,"Tom", 19,1000);
		Employee e2 = new Employee(1001,"Tim", 19,1000);

		Supplier<String> sup1 = () -> e1.getName();
		System.out.println(sup1.get());

		System.out.println("************");
		Supplier<String> sup2 = e2 :: getName;
		System.out.println(sup2.get());




	}

	// 情况二：类 :: 静态方法
	//Comparator中的int compare(T t1,T t2)
	//Integer中的int compare(T t1,T t2)
	@Test
	public void test3() {

		Comparator<Integer> com1 = (t1,t2) -> Integer.compare(t1,t2);
		int compare = com1.compare(21, 23);
		System.out.println(compare);

		System.out.println("************");

		Comparator<Integer> com2 = Integer :: compare;
	}
	
	//Function中的R apply(T t)
	//Math中的Long round(Double d)
	@Test
	public void test4() {

		Function<Double,Long> func1 = d -> Math.round(d);
		Long aLong = func1.apply(23.23);
		System.out.println(aLong);

		System.out.println("************");

		Function<Double,Long> func2 = Math :: round;
		Long aLong1 = func1.apply(23.83);
		System.out.println(aLong1);

	}

	// 情况三：类 :: 实例方法 (有难度)
	// Comparator中的int comapre(T t1,T t2)
	// String中的int t1.compareTo(t2)
	@Test
	public void test5() {
		Comparator<String> com1 = (s1,s2) -> s1.compareTo(s2);

		int compare = com1.compare("123", "abc");
		System.out.println(compare);

		System.out.println("************");

		Comparator<String> com2 = String :: compareTo;

		int compare1 = com2.compare("abc", "abcd");
		System.out.println(compare1);

	}

	//BiPredicate中的boolean test(T t1, T t2);
	//String中的boolean t1.equals(t2)
	@Test
	public void test6() {
		BiPredicate<String, String> pre1 = (s1,s2) -> s1.equals(s2);
		System.out.println(pre1.test("abc", "abc"));

		System.out.println("************");

		BiPredicate<String, String> pre2 = String::equals;
		System.out.println(pre1.test("abcd", "abcc"));



	}
	
	// Function中的R apply(T t)
	// Employee中的String getName();
	@Test
	public void test7() {
		Employee jerry = new Employee(1001, "Jerry", 12, 100);

		Function<Employee,String> fun1 = e -> e.getName();
		String s = fun1.apply(jerry);
		System.out.println(s);

		System.out.println("************");

		Function<Employee,String> fun2 =Employee::getName;
		String s1 = fun2.apply(jerry);
		System.out.println(s1);


	}

}
