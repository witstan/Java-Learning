/*
题目：
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入 
为0时结束程序。

说明：
1. 不在循环条件部分限制次数的结构：for(;;)或while(true)
2. 结束循环有几种方式？
	方式一：循环条件部分返回false
	方式二：在循环体中执行break
*/
import java.util.Scanner;

class ForWhileTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		int num;
		int count1 = 0;
		int	count2 = 0;
		do{
			System.out.println("请输入整数：");
			num = scan.nextInt();
			if (num > 0){
				count1++;
			}else if(num < 0){
				count2++;
			}

		}
		while (num != 0);
		
		System.out.println("以上有" + count1 +"个正数，有" + count2 + "个负数");//在do-while结构中，当不满足while条件，while语句以下部分不执行

		

		//换while
		/*
		int num = 1;
		int count1 = 0;
		int count2 = 0;
		while (num != 0){
			System.out.println("请输入整数：");
			num = scan.nextInt();
			if (num > 0){
				count1++;
			}else if(num < 0){
				count2++;
			}
		}
		System.out.println("以上有" + count1 +"个正数，有" + count2 + "个负数");
		
		*/

		//**************课程版*************
		
		/*
		int positiveNumber = 0;//记录正数个数
		int negetiveNumber = 0;//记录正数个数

		while (true){//for(;;){

			int number = scan.nextInt();

			//判断正负情况
			if (number > 0){
				positiveNumber++;
			}else if (number < 0){
				negetiveNumber++;
			}else{
				//一旦执行break，跳出循环
				break;
			}
		}
		*/
		//三者区别在于，do-while不需要先给num赋值，因为会先执行括号内的循环体，while需要先给num赋值，因为要做判断，
		//而课程版给出了新的思路，在循环体内部进行判断
	}
}
