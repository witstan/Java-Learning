/*
String���ͱ�����ʹ��
1.String����������������
2.����String����ʹ��˫����""
3.String���Ժ�8�ֻ����������ͱ��������㣬������ֻ������������
4.����������String����

*/

class StringTest{
	public static void main(String[] args){
		
		String s1 = "Hello World";

		System.out.println(s1);

		String s2 = "a";
		System.out.println(s2);

		String s3 = "";
		System.out.println(s3);

		//char c = '';���벻ͨ��
		//*********************************

		int i1 = 114;
		String numberStr = "ѧ�ţ�";
		String info = numberStr + i1;//+��Ϊ��������
		boolean b1 = true;
		String info1 = info + b1;//+Ҳ��Ϊ��������
		System.out.println(info1);

		//*********************************
		//��ϰ
		char c = 'a';
		/*a = 97; A = 65��char�������ͺ�byte��short��int��long��float��double
		�����������͹�ͬ����ʱȡ��ASCII�ж�Ӧ����ֵ*/
		int i = 10;
		String s = "hello";
		System.out.println(c + i + s);//107hello
		System.out.println(c + s + i);//ahello10
		System.out.println(c + (i + s));//a10hello
		System.out.println((c + i) + s);//107hello
		System.out.println(s + i +c);//hello10a

		//��ϰ2
		//��� *	*���м�Ϊtab��
		System.out.println("*	*");
		//*	*
		System.out.println('*' + '\t' + '*');
		//93(42 + 9 +42)
		System.out.println('*' + "\t" + '*');
		//*	*
		System.out.println('*' + '\t' + "*");
		//51*
		System.out.println('*' + ('\t' + "*"));
		//*	*
		System.out.println('*' + "\\t" + '*');
		//���*\t*
		
	}
}
