package com.witstan.java2;

import java.lang.reflect.Field;
import java.util.*;

import com.witstan.exer4.Account;
import com.witstan.exer4.Bank;
import com.witstan.java2.java3.Bear;

import static java.lang.System.*;
import static java.lang.Math.*;

/*
 * 一、package关键字的使用
 * 1.为了更好得实现项目中类的管理，提供包的概念
 * 2.使用package声明类或接口所属的包，声明在源文件的首行
 * 3.包，属于标识符，遵循标识符的命名规则、规范（xxxyyyzzz）、“见名知意”
 * 4.每“.”一次，就代表一层文件目录。
 * 	
 * 	补充：同一个包下，不能存在同名的接口、类
 * 		不同的包下可以存在同名的接口、类
 * 
 * 二、import关键字的使用
 * 1.在源文件中，显式地使用import结构导入指定包下的类、接口
 * 2.声明在包的声明和类的声明之间
 * 3.如果需要导入多个结构，则并列写出即可；
 * 4.可以使用“ xxx.* ”的方式表示可以导入xxx包下的所有结构
 * 5.如果使用的类或接口是java.lang包下定义的，则可以省略import结构
 * 6.如果使用的类或接口是同一个包下定义的，则可以省略import结构
 * 7.如果在源文件中使用了不同包下的同名类，则至少有一个类需要使用全类名的方式显式
 * 8.使用“ xxx.* ”方式表明可以调用xxx包下的所有结构，但如果使用的是xxx子包下的结构，则仍需要显式地使用import导入
 * 
 * 9.import static：导入指定类或接口中的静态结构：属性或方法
 * 
 */
public class PackageImportTest {
	public static void main(String[] args) {
		
		String s = Arrays.toString(new int[]{1,2,3});
		
		Bank bank = new Bank();
		
		ArrayList list  = new ArrayList();
		HashMap map = new HashMap();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("hello");
		
		Person p = new Person();
		
		Account a1 = new Account(100);
		
		com.witstan.exer3.Account a2 = new com.witstan.exer3.Account(123,123,0.0123);
		
		Date date = new Date();
		java.sql.Date date1 = new java.sql.Date(394759345L);
		
		Bear bear = new Bear();
		
		Field field = null;
		
		out.println("hello");
		
		long num = round(324.23);
	}
}
