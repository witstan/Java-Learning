/*
��д���򣺴Ӽ���������2019��ġ�month���͡�day����Ҫ��ͨ������ 
������������Ϊ2019��ĵڼ��졣

2 15: 31 + 15

5 7: 31 + 28 + 31 + 30 + 7

˵����
break��switch-case���ǿ�ѡ��


*/
import java.util.Scanner;
class SwitchCaseTest2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�������·ݣ���1~12��");
		int month = scan.nextInt();
		System.out.println("���������ڣ���1~31��");
		int day = scan.nextInt();
		
		//��ʽһ
		switch (month){
			case 1:
				System.out.println("������Ϊ2019��ĵ� " + day + " ��");
				break;
			case 2:
				System.out.println("������Ϊ2019��ĵ� " + (31 + day) + " ��");
				break;
			case 3:
				System.out.println("������Ϊ2019��ĵ� " + (59 + day) + " ��");
				break;
			case 4:
				System.out.println("������Ϊ2019��ĵ� " + (90 + day) + " ��");	
				break;
			case 5:
				System.out.println("������Ϊ2019��ĵ� " + (120 + day) + " ��");
				break;
			case 6:
				System.out.println("������Ϊ2019��ĵ� " + (151 + day) + " ��");
				break;
			case 7:
				System.out.println("������Ϊ2019��ĵ� " + (181 + day) + " ��");
				break;
			case 8:
				System.out.println("������Ϊ2019��ĵ� " + (212 + day) + " ��");
				break;
			case 9:
				System.out.println("������Ϊ2019��ĵ� " + (243 + day) + " ��");
				break;
			case 10:
				System.out.println("������Ϊ2019��ĵ� " + (273 + day) + " ��");
				break;
			case 11:
				System.out.println("������Ϊ2019��ĵ� " + (304 + day) + " ��");
				break;
			case 12:
				System.out.println("������Ϊ2019��ĵ� " + (334 + day) + " ��");	
		}
		
		//��ʽ��
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
		System.out.println("������Ϊ2019��ĵ� " + sumDay + " ��");
	}
}