/*

数据类型变量的一些特殊情况

*/


class VariableTest4 {
	public static void main(String[] args){

		long l1 = 114514;
		System.out.println(l1);
		/*一般的，long数据类型后面需要以大写或小写的l结尾，
		当没有以此结尾时，此时计算机默认为其使用4个字节存放，也就是识别为int类型,
		*/
		//若数据量超过int类型规定范围，则无法编译，如下:
		//long l2 = 1145141919810;
		//则会提示：过大整数
		long l2 = 1145141919810l;
		System.out.println(l2);

		//******************************************
		
		//float不以f结尾则会立刻编译失败
		float f1 = 12.3f;
		


		//以下重要！！！！*********
		//对于整型常量，默认为int型
		//对于浮点型常量，默认为double型
		float f2 = 12.3 + 12.3

	
	}
}
