/*
String类型变量的使用
1.String属于引用数据类型
2.声明String变量使用双引号""
3.String可以和8种基本数据类型变量做运算，且运算只能是连接运算
4.运算结果仍是String类型

*/

class StringTest{
	public static void main(String[] args){
		
		String s1 = "Hello World";

		System.out.println(s1);

		String s2 = "a";
		System.out.println(s2);

		String s3 = "";
		System.out.println(s3);

		//char c = '';编译不通过
		//*********************************

		int i1 = 114;
		String numberStr = "学号：";
		String info = numberStr + i1;//+作为连接运算
		boolean b1 = true;
		String info1 = info + b1;//+也作为连接运算
		System.out.println(info1);

		//*********************************
		//练习
		char c = 'a';
		/*a = 97; A = 65，char数据类型和byte、short、int、long、float、double
		基础数据类型共同运算时取其ASCII中对应的数值*/
		int i = 10;
		String s = "hello";
		System.out.println(c + i + s);//107hello
		System.out.println(c + s + i);//ahello10
		System.out.println(c + (i + s));//a10hello
		System.out.println((c + i) + s);//107hello
		System.out.println(s + i +c);//hello10a

		//练习2
		//输出 *	*（中间为tab）
		System.out.println("*	*");
		//*	*
		System.out.println('*' + '\t' + '*');
		//93(42 + 9 +42)
		System.out.println('*' + "\t" + '*');
		//*	*
		System.out.println('*' + '\t' + "*");
		//51*
		System.out.println('*' + ('\t' + "*"));
		//*	*
		System.out.println('*' + "\\t" + '*');
		//输出*\t*
		
	}
}
