/*
�Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ��� 
ע���ж�һ���Ƿ�������ı�׼��
1�����Ա�4�����������ɱ�100���� 
��
2�����Ա�400����

˵����
1.���ǿ���ʹ��switch-case�Ľṹ��������ʹ��if-else����֮����������
2.��д��֧�ṹʱ���ȿ���ʹ��switch-case����ͬʱ��switch�б���ʽ��ȡֵ�����̫�ࣩ��
�ֿ���ʹ��if-elseʱ������ѡ��switch-case��ԭ��switch-caseִ��Ч���Ըߡ�
*/
import java.util.Scanner;
class SwitchCaseExer{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		System.out.println("�������·ݣ���1~12��");
		int month = scan.nextInt();
		System.out.println("���������ڣ���1~31��");
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
		System.out.println("������Ϊ " + year + " ��ĵ� " + sumDay + " ��");

	}
}