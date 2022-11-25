/*
如何从键盘获取不同类型的变量：需要使用Scanner类

具体实现步骤：
1.导包 import java.util.Scanner;
2.Scanner的实例化：Scanner scan = new Scanner(System.in);
3.调用Scanner类的相关方法，来获取指定类型的变量

注意：
需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要去的类型不匹配时，
会报异常导致程序终止。
*/

import java.util.Scanner;

class  ScannerTest{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("请收入您的姓名：");
		//int num = scan.nextInt();
		String name = scan.next();
		System.out.println(name);

		System.out.println("请收入您的年龄：");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("请输入您的体重：");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("是否如实告知？（true/false）");
		boolean truth = scan.nextBoolean();
		System.out.println(truth);

		//对于char型获取Scanner没有提供相关方法，只能获取一个字符串
		System.out.println("请输入您的性别：（男/女）");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
	}
}
