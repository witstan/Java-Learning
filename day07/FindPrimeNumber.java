/*
������ϰ��Ŀ


*/
import java.util.Scanner;

class FindPrimeNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//���дһ������0�����֣��ж����������Ǻ���������Ǻ�����ӡ����������Լ��
		
		System.out.println("������һ����������");
		int pn = scan.nextInt();
		if(pn == 1){
			System.out.println("1�Ȳ��Ǻ���Ҳ����������");
		}
		boolean b1 = false;
		for (int i = 2; i < pn; i++){
			if (pn % i == 0){
				b1 = true;
				System.out.println(pn + "�Ǻ���������Լ���У�" + i);
			}
		}
		if (b1 == false){
			System.out.println(pn + "��һ������");
		}
		
		

		
		//���n���ڵ�����
		/*
		System.out.println("������һ�������������Զ����ظ�������Χ�ڵ�����");
		int num = scan.nextInt();
		if(num == 1){
			System.out.println("1�Ȳ��Ǻ���Ҳ������������С������Ϊ2�����2��ʼ��");
		}


		boolean b1 = true;
		for (int pn = 2; pn <= num; pn++){
			for (int i = 2; i < pn / 2; i++){
				if (pn % i == 0){
					b1 = false;
				}
			}
			if (b1 == true){
				System.out.println(pn);
			}
			b1 = true;

		}
		*/


    }
}