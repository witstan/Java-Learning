/*
Java定义的数据类型

1.按数据类型分：

	基本数据类型：
	整数型：byte\short\int\long
	浮点型；float\double
	字符型：char
	布尔型：boolean

	引用数据类型:
	类 class
	接口 interface
	数组 array

2.在类中声明的位置：
	
	成员变量
	局部变量

*/

class VariableTest1 {
	public static void main(String[] args) {
		//整数型：byte(1字节 = 8 bit）\short（2字节）\int（4字节）\long（8字节）
		//①byte范围：-128-127
		byte b1 = 12;
		//byte b2 = -128
		//b2 = 128,编译不通过
		//②声明long型变量，必须以“l”或“L”结尾
		//通常，定义整数型变量时，使用int型。
		short s1 = 128;
		int i1 = 1234;
		long l1 = 3427374L;
		System.out.println(l1);	

		//浮点型：float(4字节）\double（8字节）
		//浮点型表示带小数的数值

		double d1 = 123.4;
		System.out.println(d1);
		//定义float时需要在末尾以“f”或“F”结尾
		float f1 = 12.3F;
		System.out.println(f1);
		//通常定义浮点型变量使用double型

		//字符型：char（1字符 = 2字节）
		char c1 = 'a';
		//char c2 = 'ab';编译不通过
		//char只能声明一个字符
		System.out.println(c1);

		char c3 = '@';
		char c4 = '拆';
		char c5 = 'え';
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		//表示方式：1.声明一个字符；2.转义字符
		char c6 = '\n';//换行符
		c6 = '\t';//制表符
		
		System.out.print("hello" + c6);
		System.out.println("world");

		char c7 = '\u0123';
		System.out.println(c7);
		
		//可以使用unicode字符编码集
		char c8 = '\u0043';
		System.out.println(c8);

		char c9 = 97;
		//输出'a'，但开发中非常少见

		//布尔型：boolean
		//①只能取两个值：true\false
		//常在条件判断、循环结构中使用
		boolean bb1 = true;
		System.out.println(bb1);

		boolean isgay = true;
		if(isgay){
			System.out.println("congrates");
			//需要在“”中使用双引号，在需要使用的双引号前加\，例如如下
			System.out.println("这是一个\"根蒲\"");
		}else{
			System.out.println("okay");
		}



	}
}
