/*
��Ŀ����������������m��n���������Լ������С�������� 
���磺12��20�����Լ����4����С��������60��
˵����break�ؼ��ֵ�ʹ��
*/

import java.util.Scanner;

class ForTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�������һ����������");
		int m = scan.nextInt();
		System.out.println("������ڶ�����������");
		int n = scan.nextInt();
		
		int big;
		int small;
		
		if (m > n){
			big = m;
			small = n;
		}else{
			big = n;
			small = m;
		}
		
		//(m > n)? (big = m, small = n): (big = n, small = m); �﷨��������ˣ�����
		//����������Լ��greatest common divisor��gcd
		int gcd = 1;
		for (int sub = small; sub > 0; sub--){
			if (small % sub == 0 && big % sub == 0){
				gcd = sub;
				sub = -1;
				//ʹ��break�Ϳ����ˣ���һ����ѭ����ִ�е�break��������ѭ����
			}	
		}
		//���������С������least common multiple��lcm
		int lcm = big;
		for (int mul = big; mul <= big*small; mul++){//����lcmһ��С�ڵ�������֮��
		//for (int mul = big; mul > 0; mul++){ ԭʼд��
			if (mul % big == 0 && mul % small == 0){
				lcm = mul;
				mul = -1;//break
				
			}	
		}

		System.out.println(m + "��" + n + "�����Լ��Ϊ��" + gcd + ",��С������Ϊ��" + lcm);	
	}
}
