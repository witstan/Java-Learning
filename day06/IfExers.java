/*
1)  ��д��������2��int�ͱ�������ֵ���ж�����֮�ͣ�������ڵ� 
��50����ӡ��hello world!��

2)  ��д��������2��double�ͱ�������ֵ���жϵ�һ��������10.0�� 
�ҵ�2����С��20.0����ӡ����֮�͡����򣬴�ӡ�����ĳ˻���

3) �ҼҵĹ�5���ˣ�5��Ĺ��൱���������أ���ʵ������ǰ����ÿ 
һ���൱�������10.5�֮꣬��ÿ����һ����������ꡣ��ô5��Ĺ� 
�൱��������������أ�Ӧ���ǣ�10.5 + 10.5 + 4 + 4 + 4 = 33�ꡣ
��дһ�����򣬻�ȡ�û�����Ĺ������䣬ͨ��������ʾ���൱���� 
������䡣����û����븺��������ʾһ����ʾ��Ϣ��

*/

import java.util.Scanner;

class IfExer_1 {
	public static void main(String[] args) {

		int num1 = 70, num2 = 30;
		if ((num1 + num2) > 50){
			System.out.println("Hello World!");
		}
	}
}

class IfExer_2{
	public static void main(String[] args){
	
		double d1 = 10.0, d2 = 20.3;
		if (d1 > 10.0 && d2 < 20.0){
			System.out.println(d1 + d2);
		}else{
			System.out.println(d1 * d2);
		}
	}
}


class IfExer_3{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("�������޹������䣺");
		int age = scan.nextInt();
		if (age < 0 || age > 30){
			System.out.println("��������ȷ������");
		}else if(age <= 2){
			System.out.println("�൱����������䣺" + (age*10.5)+ "��");
		}else{
			System.out.println("�൱����������䣺" + ((age - 2)*4 + 21)+ "��");
		}
		
	}
}