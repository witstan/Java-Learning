
/*
û�����£�����ѵ��
��ӡn���ڵ�쳲���������
0,1,1,2,3,5,8,13,21,34,55...
*/

import java.util.Scanner;

class Fibonacci {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ���������������ظ�������쳲��������У�");
		int max = scan.nextInt();
		int i1 = 1, i2 = 0;
		int temp;
		for (int n = 1; n <= max; n++){
			System.out.print(i2 + ",");
			//�ӵ�48�ʼ��Ϊint���ݴ洢��Χ�����⣬����ֲ����ϵĽ���������Ժ�ѧϰ���ٴ�����
			temp = i1;
			i1 = i2;
			i2 += temp;
			}
	}
}