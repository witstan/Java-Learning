/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3， 
对它们进行排序(使用  if-else if-else),并且从小到大输出。

说明：
1. if-else可以嵌套使用
2. 如果if-else里面的执行语句只有一行时，{}可以省略，但是！不建议省略
*/

import java.util.Scanner;

class IfTest1{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("请输入第1个整数：");

		int num1 = scan.nextInt();

		System.out.println("请输入第2个整数：");

		int num2 = scan.nextInt();

		System.out.println("请输入第3个整数：");

		int num3 = scan.nextInt();

		String ans = "";

		if (num1 < num2 && num1 < num3){
			ans = (num2 < num3)? ("从小到大排列为：" + num1 + " < " + num2 + " < " + num3): ("从小到大排列为：" + num1 + " < " + num3 + " < " + num2);
		}else if(num2 < num1 && num2 < num3){
			ans = (num1 < num3)? ("从小到大排列为：" + num2 + " < " + num1 + " < " + num3): ("从小到大排列为：" + num2 + " < " + num3 + " < " + num1);
		}else if(num3 < num1 && num3 < num2){
			ans = (num1 < num3)? ("从小到大排列为：" + num3 + " < " + num1 + " < " + num3): ("从小到大排列为：" + num3 + " < " + num3 + " < " + num1);
		}	

		System.out.println(ans);
		
	}
}
