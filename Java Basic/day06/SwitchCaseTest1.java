/*
例题：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
*/
import java.util.Scanner;

class  SwitchCaseTest1{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入成绩：（0~100）");
		int score = scan.nextInt();
		/*
		int score1 = score / 10;
		switch(score1){
			case 10:
				System.out.println("合格");
				break;
			case 9:
				System.out.println("合格");
				break;
			case 8:
				System.out.println("合格");
				break;
			case 7:
				System.out.println("合格");
				break;
			case 6:
				System.out.println("合格");
				break;
			default:
				System.out.println("不合格");
			}
		*/

		//方法二：
		int score2 = score / 60;
		switch (score2){
			case 1:
				System.out.println("合格");
				break;
			default:
				System.out.println("不合格");

		}
	}
}
