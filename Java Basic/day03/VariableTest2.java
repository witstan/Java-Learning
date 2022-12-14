/*
基本数据类型之间的运算规则：

前提：只讨论7中基本数据类型变量间的运算，不包含boolean型。

1.自动类型提升：
	byte、short、char > int > long > float > double
	涉及到容量不同的数据类型变量在一起运算，其结果提升为容量大的数据类型。（此处容量大小指数据类型的范围，而不是实际大小）
	
	!当byte、short、char三种类型变量做运算，结果为int类型

2.强制类型转换：
	见VariableTest3.java

*/

class VariableTest2{
	public static void main(String[] args) {
		
		byte b1 = 1;
		int i1 = 128;
		/*求和情况如果用byte数据类型编译不通过，因为int占用字节更多，
		用占用字节更少的byte可能丢失数据*/
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		System.out.println(i2);

		float f = b1 + +i1;
		System.out.println(f);
	}
}
