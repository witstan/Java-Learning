/*
2. ʹ��switch����д����if��䣺
 	 int a = 3;
 	 int x = 100;
 	 if(a==1)
		x+=5;
 	 else if(a==2)
		x+=10;
 	 else if(a==3)
		x+=16;
 	 else		
		x+=34;

*/

import java.util.Scanner;

class homework_4 {
	public static void main(String[] args) {

		int a = 3, x = 100;
		switch (a){
		case 1:
			x += 5;
			break;
		case 2:
			x += 10;
			break;
		case 3:
			x += 16;
			break;
		default:
			x += 34;
		}
		System.out.println(x);


		//��δӿ���̨��ȡString��int�͵ı������������ʹ�ô���ʵ��

		/*
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = scan.next();
		System.out.println(num);
		System.out.println(str);
		*/


		//ʹ��forѭ������100���ڵ����������������е������ĺͲ������
		int sum = 0;
		for (int odd = 1; odd <= 100; odd++){
			if (odd % 2 != 0){
				System.out.println(odd);
				sum += odd;
			}
		}
		System.out.println("100��������������Ϊ��" + sum);

	}
}


