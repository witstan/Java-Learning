/*
��δӼ��̻�ȡ��ͬ���͵ı�������Ҫʹ��Scanner��

����ʵ�ֲ��裺
1.���� import java.util.Scanner;
2.Scanner��ʵ������Scanner scan = new Scanner(System.in);
3.����Scanner�����ط���������ȡָ�����͵ı���

ע�⣺
��Ҫ������Ӧ�ķ�����������ָ�����͵�ֵ��������������������Ҫȥ�����Ͳ�ƥ��ʱ��
�ᱨ�쳣���³�����ֹ��
*/

import java.util.Scanner;

class  ScannerTest{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("����������������");
		//int num = scan.nextInt();
		String name = scan.next();
		System.out.println(name);

		System.out.println("�������������䣺");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("�������������أ�");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("�Ƿ���ʵ��֪����true/false��");
		boolean truth = scan.nextBoolean();
		System.out.println(truth);

		//����char�ͻ�ȡScannerû���ṩ��ط�����ֻ�ܻ�ȡһ���ַ���
		System.out.println("�����������Ա𣺣���/Ů��");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
	}
}
