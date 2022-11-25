/*
岳小鹏参加Java考试，他和父亲岳不群达成承诺： 
如果：
成绩为100分时，奖励一辆BMW；
成绩为(80，99]时，奖励一台iphone xs max； 
当成绩为[60,80]时，奖励一个  iPad； 
其它时，什么奖励也没有。
请从键盘输入岳小鹏的期末成绩，并加以判断

说明：
1. else结构时可选的。
2.针对于条件表达式：
	> 如果多个条件表达式之间是”互斥“关系（或没有交集关系），
	  那么书写表达式顺序不影响
	> 如果多个条件表达式之间有交集关系，
	  需要根据实际情况考虑清楚应该将哪个结构声明在上面
	> 如果多个表达式有包含与被包含的关系，通常情况下需要将
	  范围小的写在前面，否则小的不会有机会执行
*/

import java.util.Scanner;

class IfTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("请输入成绩：");

		int score = scan.nextInt();

		if(score >= 60 && score <= 80){
			System.out.println("奖励一个ipad");
		}else if(score > 80 && score <= 99){
			System.out.println("奖励一台iphone xs max");
		}else if(score == 100){
			System.out.println("奖励一辆BMW");
		}else if(score < 0 || score > 100){
			System.out.println("请输入正确的成绩");
		}else{
			System.out.println("什么奖励也没有");
		} 

	}
}
