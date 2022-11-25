
/*
没事找事，自主训练
打印n以内的斐波那契数列
0,1,1,2,3,5,8,13,21,34,55...
*/

import java.util.Scanner;

class Fibonacci {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个正整数，将返回该项数的斐波那契数列：");
		int max = scan.nextInt();
		int i1 = 1, i2 = 0;
		int temp;
		for (int n = 1; n <= max; n++){
			System.out.print(i2 + ",");
			//从第48项开始因为int数据存储范围的问题，会出现不符合的结果，留到以后学习了再处理吧
			temp = i1;
			i1 = i2;
			i2 += temp;
			}
	}
}
