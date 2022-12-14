/*
从键盘分别输入年、月、日，判断这一天是当年的第几天 
注：判断一年是否是闰年的标准：
1）可以被4整除，但不可被100整除 
或
2）可以被400整除

说明：
1.凡是可以使用switch-case的结构，都可以使用if-else，反之，不成立。
2.当写分支结构时，既可以使用switch-case，（同时，switch中表达式的取值情况不太多），
又可以使用if-else时，优先选择switch-case，原因：switch-case执行效率稍高。
*/
import java.util.Scanner;
class SwitchCaseExer{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：（1~12）");
		int month = scan.nextInt();
		System.out.println("请输入日期：（1~31）");
		int day = scan.nextInt();
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
			//sumDay += 28;
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
				sumDay += 29;
			}else{
				sumDay += 28;
			}
		case 2:
			sumDay += 31;
		case 1:
			sumDay += day;
		}
		System.out.println("该日期为 " + year + " 年的第 " + sumDay + " 天");

	}
}
