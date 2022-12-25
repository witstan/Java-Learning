/*
运算符之六：三元运算符 Ternary Operation
1.结构：(条件表达式)?表达式1 : 表达式2
2.说明：
①条件表达式的结果位boolean类型
②根据条件表达式true或false来执行表达式1或表达式2
 如果表达式为true，执行表达式1
 如果表达式为false，执行表达式2
③两个表达式的值需要与该函数声明类型一致
④三元运算符可以嵌套使用

3.凡是可以使用三元运算符，都可以改写为if-else
反之，不成立（例如返回的两个值为不同类型）

4.如果程序即可以使用三元运算符也可以使用if-else，
那么选择三元运算符，简洁高效
*/

class TernaryTest {
	public static void main(String[] args) {
		
		//获取两个整数的较大值
		int m = 12;
		int n = 5;
		int max = (m > n)? m : n;
		System.out.println(max);


		double num = (m > n)? 2 : 1.0;
		//double num = (m > n)? 2 : "n大";//编译错误
		
		//************************************
		n = 12;
		n = 22;
		String maxStr = (m > n)? "m大" : ((m == n)? "m、n相等" : "n大");
		System.out.println(maxStr);

		//*****************************
		//获取三个数的最大值
		int n1 = 12;
		int n2 = 30;
		int n3 = -43;

		int max1 = (n1 > n2)? n1 : n2;
		int max2 = (max1 > n3)? max1 : n3;
		System.out.println(max2);

		//输出哪个更大的字符串
		String maxStrn1n2n3 = (n1 > n2)? ((n1 > n3)? "n1大" : "n3大") : ((n2 > n3)? "n2大" : "n3大");
		System.out.println(maxStrn1n2n3);

		//改写if-else：
		if(m > n){
			System.out.println(m);
		}else{
			System.out.println(n);
		}
	}
}
