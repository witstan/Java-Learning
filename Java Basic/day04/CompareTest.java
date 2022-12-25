/*
运算符之三：比较运算符
== != > < >= <= instanceof

结论
1. 比较运算符的运算结果是boolean类型
2. 区分 == 和 =

*/

class CompareTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;

		System.out.println(i == j);//false
		System.out.println(i = j);//20

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 == b2);//false
		System.out.println(b1 = b2);
		//false，但这里的false为b2的值赋给b1，而不是比较运算，注意

	}
}
