/*
do-whileѭ����ʹ��

һ��ѭ���ṹ��4Ҫ��
�ٳ�ʼ������
��ѭ������ --->boolean����
��ѭ����
�ܵ�������

����do-whileѭ���ṹ��

��
do{
	�ۣ�
	�ܣ�
}while(��);

ִ�й��̣��� - �� - �� - �� - �� - �� - �� - ���� - ��

˵����
1.do-whileѭ�����ٻ�ִ��һ��ѭ���壡
2.������ʹ��for��while����һЩ������ʹ��do-while
*/

class DoWhileTest{
	public static void main(String[] args) {

		//����100���ڵ�ż��
		int num = 1;
		int sum = 0;//��¼�ܺ�
		int count = 0;//��¼����
		do{
			if (num % 2 == 0){
				System.out.println(num);
				sum += num;
				count++;
			}
			num++;
		}
		while (num <= 100);
		//*************************
		int number1 = 10;
		while (number1 > 10){
			System.out.println("Hello:while");
			number1--;
		}
		int number2 = 10;
		do{
			System.out.println("Hello:do-while");
			number2--;
		}
		while (number2 > 10);
	}
}