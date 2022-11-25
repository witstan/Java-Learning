/*
1)  编写程序，声明2个int型变量并赋值。判断两数之和，如果大于等 
于50，打印“hello world!”

2)  编写程序，声明2个double型变量并赋值。判断第一个数大于10.0， 
且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。

3) 我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每 
一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗 
相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人 
类的年龄。如果用户输入负数，请显示一个提示信息。

*/

import java.util.Scanner;

class IfExer_1 {
	public static void main(String[] args) {

		int num1 = 70, num2 = 30;
		if ((num1 + num2) > 50){
			System.out.println("Hello World!");
		}
	}
}

class IfExer_2{
	public static void main(String[] args){
	
		double d1 = 10.0, d2 = 20.3;
		if (d1 > 10.0 && d2 < 20.0){
			System.out.println(d1 + d2);
		}else{
			System.out.println(d1 * d2);
		}
	}
}


class IfExer_3{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("请输入修沟的年龄：");
		int age = scan.nextInt();
		if (age < 0 || age > 30){
			System.out.println("请输入正确的年龄");
		}else if(age <= 2){
			System.out.println("相当于人类的年龄：" + (age*10.5)+ "岁");
		}else{
			System.out.println("相当于人类的年龄：" + ((age - 2)*4 + 21)+ "岁");
		}
		
	}
}
