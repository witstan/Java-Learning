/*
��д�����ɼ����������������ֱ�������num1��num2��num3�� 
�����ǽ�������(ʹ��  if-else if-else),���Ҵ�С���������

˵����
1. if-else����Ƕ��ʹ��
2. ���if-else�����ִ�����ֻ��һ��ʱ��{}����ʡ�ԣ����ǣ�������ʡ��
*/

import java.util.Scanner;

class IfTest1{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("�������1��������");

		int num1 = scan.nextInt();

		System.out.println("�������2��������");

		int num2 = scan.nextInt();

		System.out.println("�������3��������");

		int num3 = scan.nextInt();

		String ans = "";

		if (num1 < num2 && num1 < num3){
			ans = (num2 < num3)? ("��С��������Ϊ��" + num1 + " < " + num2 + " < " + num3): ("��С��������Ϊ��" + num1 + " < " + num3 + " < " + num2);
		}else if(num2 < num1 && num2 < num3){
			ans = (num1 < num3)? ("��С��������Ϊ��" + num2 + " < " + num1 + " < " + num3): ("��С��������Ϊ��" + num2 + " < " + num3 + " < " + num1);
		}else if(num3 < num1 && num3 < num2){
			ans = (num1 < num3)? ("��С��������Ϊ��" + num3 + " < " + num1 + " < " + num3): ("��С��������Ϊ��" + num3 + " < " + num3 + " < " + num1);
		}	

		System.out.println(ans);
		
	}
}