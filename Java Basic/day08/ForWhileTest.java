/*
��Ŀ��
�Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ��������� 
Ϊ0ʱ��������

˵����
1. ����ѭ�������������ƴ����Ľṹ��for(;;)��while(true)
2. ����ѭ���м��ַ�ʽ��
	��ʽһ��ѭ���������ַ���false
	��ʽ������ѭ������ִ��break
*/
import java.util.Scanner;

class ForWhileTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		int num;
		int count1 = 0;
		int	count2 = 0;
		do{
			System.out.println("������������");
			num = scan.nextInt();
			if (num > 0){
				count1++;
			}else if(num < 0){
				count2++;
			}

		}
		while (num != 0);
		
		System.out.println("������" + count1 +"����������" + count2 + "������");//��do-while�ṹ�У���������while������while������²��ֲ�ִ��

		

		//��while
		/*
		int num = 1;
		int count1 = 0;
		int count2 = 0;
		while (num != 0){
			System.out.println("������������");
			num = scan.nextInt();
			if (num > 0){
				count1++;
			}else if(num < 0){
				count2++;
			}
		}
		System.out.println("������" + count1 +"����������" + count2 + "������");
		
		*/

		//**************�γ̰�*************
		
		/*
		int positiveNumber = 0;//��¼��������
		int negetiveNumber = 0;//��¼��������

		while (true){//for(;;){

			int number = scan.nextInt();

			//�ж��������
			if (number > 0){
				positiveNumber++;
			}else if (number < 0){
				negetiveNumber++;
			}else{
				//һ��ִ��break������ѭ��
				break;
			}
		}
		*/
		//�����������ڣ�do-while����Ҫ�ȸ�num��ֵ����Ϊ����ִ�������ڵ�ѭ���壬while��Ҫ�ȸ�num��ֵ����ΪҪ���жϣ�
		//���γ̰�������µ�˼·����ѭ�����ڲ������ж�
	}
}