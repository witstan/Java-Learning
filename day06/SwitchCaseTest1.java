/*
���⣺��ѧ���ɼ�����60�ֵģ�������ϸ񡱡�����60�ֵģ���������ϸ񡱡�
*/
import java.util.Scanner;

class  SwitchCaseTest1{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ɼ�����0~100��");
		int score = scan.nextInt();
		/*
		int score1 = score / 10;
		switch(score1){
			case 10:
				System.out.println("�ϸ�");
				break;
			case 9:
				System.out.println("�ϸ�");
				break;
			case 8:
				System.out.println("�ϸ�");
				break;
			case 7:
				System.out.println("�ϸ�");
				break;
			case 6:
				System.out.println("�ϸ�");
				break;
			default:
				System.out.println("���ϸ�");
			}
		*/

		//��������
		int score2 = score / 60;
		switch (score2){
			case 1:
				System.out.println("�ϸ�");
				break;
			default:
				System.out.println("���ϸ�");

		}
	}
}
