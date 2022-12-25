/*
强制类型转换:自动类型提升运算的逆运算。
1.需要使用强转符；
2.可能损失精度

*/

class VariableTest3{
	public static void main(String[] args) {

		double d1 = 12.9;//截断操作
		int i1 = (int)d1;
		//精度损失类型1
		System.out.println(i1);

		long l1 = 23;
		short s1 = (short)l1;
		//没有精度损失
		System.out.println(s1);

		int i2 = 128;
		byte b1 = (byte)i2;
		//精度损失类型2
		System.out.println(b1);

		int i3 = -129;
		byte b2 = (byte)i3;
		//会出现怎样的结果？
		System.out.println(b2);


	}
}
