/*
编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序 
输出输入的日期为2019年的第几天。

2 15: 31 + 15

5 7: 31 + 28 + 31 + 30 + 7

说明：
break在switch-case中是可选的


*/
import java.util.Scanner;
class SwitchCaseTest2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入月份：（1~12）");
		int month = scan.nextInt();
		System.out.println("请输入日期：（1~31）");
		int day = scan.nextInt();
		
		//方式一
		switch (month){
			case 1:
				System.out.println("该日期为2019年的第 " + day + " 天");
				break;
			case 2:
				System.out.println("该日期为2019年的第 " + (31 + day) + " 天");
				break;
			case 3:
				System.out.println("该日期为2019年的第 " + (59 + day) + " 天");
				break;
			case 4:
				System.out.println("该日期为2019年的第 " + (90 + day) + " 天");	
				break;
			case 5:
				System.out.println("该日期为2019年的第 " + (120 + day) + " 天");
				break;
			case 6:
				System.out.println("该日期为2019年的第 " + (151 + day) + " 天");
				break;
			case 7:
				System.out.println("该日期为2019年的第 " + (181 + day) + " 天");
				break;
			case 8:
				System.out.println("该日期为2019年的第 " + (212 + day) + " 天");
				break;
			case 9:
				System.out.println("该日期为2019年的第 " + (243 + day) + " 天");
				break;
			case 10:
				System.out.println("该日期为2019年的第 " + (273 + day) + " 天");
				break;
			case 11:
				System.out.println("该日期为2019年的第 " + (304 + day) + " 天");
				break;
			case 12:
				System.out.println("该日期为2019年的第 " + (334 + day) + " 天");	
		}
		
		//方式二
		int sumDay = 0;
		switch (month){
		case 12:
			sumDay += 30;
		case 11:
			sumDay += 31;
		case 10:
			sumDay += 30;
		case 9:
			sumDay += 31;
		case 8:
			sumDay += 31;
		case 7:
			sumDay += 30;
		case 6:
			sumDay += 31;
		case 5:
			sumDay += 30;
		case 4:
			sumDay += 31;
		case 3:
			sumDay += 28;
		case 2:
			sumDay += 31;
		case 1:
			sumDay += day;
		}
		System.out.println("该日期为2019年的第 " + sumDay + " 天");
	}
}
