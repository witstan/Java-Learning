/**
文档注释
@author tian
@version v8.0
This is my first java file.
*/

/*
只能有一个类声明为public，要求声明为public的类名和源文件名相同。
*/

public class HelloJava{
	/*多行注释：如下的main方法是程序的入口！
	balabalabala
	*/
	/**
	如下的方式是main()，作用：程序的入口。
	*/
	public static void main(String[] args){
		//单行注释：如下语句表示输出到控制台
		//System.out.println("Hello World!")
		System.out.print("Hello World!");
		//print应用为输出后不换行
		System.out.println("Hello World!");
		//printIn应用为输出后换行
		System.out.println();
		//上方语句可实现换行

	}
}

class Person{

}

class Animal{

}