/*
Forѭ���ṹ��ʹ��
һ��ѭ���ṹ��4Ҫ��
�ٳ�ʼ������
��ѭ������ --->boolean����
��ѭ����
�ܵ�������

��forѭ���Ľṹ

for(��;��;��){
	��
}

ִ�й��̣��� - �� - �� - �� - �� - �� - �� - ���� -�ڣ�false���˳�
*/

class ForTest {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5 ; i++ ){
			System.out.println("Hello World!");
		}

		//��ϰ��
		int num = 1;
		for (System.out.print('a');num <= 3;System.out.print('c'),num++ ){
			System.out.print('b');
		}

		System.out.println();

		//���⣺����100���ڵ�ż��,�������ż���ĺ�
		int sumEven = 0;//��¼����ż���ĺ�
		int countEven = 0;//��¼ż���ĸ���
		for (int i = 1;i <= 40;i++ ){
			if (i % 2 == 0){
				System.out.println(i);
				sumEven += i;
				countEven++;
			}
		}
		System.out.println("����ż����Ϊ��" + sumEven);
		System.out.println("ż������Ϊ��" + countEven);



		//��ʽ��:
		for (int i = 2;i <= 20 ; i += 2 ){
			System.out.println(i);
		}
	}
}
