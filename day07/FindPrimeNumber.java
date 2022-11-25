/*
自主练习题目


*/
import java.util.Scanner;

class FindPrimeNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//随便写一个大于0的数字，判断是质数还是合数，如果是合数打印出它的所有约数
		
		System.out.println("请输入一个正整数：");
		int pn = scan.nextInt();
		if(pn == 1){
			System.out.println("1既不是合数也不是质数。");
		}
		boolean b1 = false;
		for (int i = 2; i < pn; i++){
			if (pn % i == 0){
				b1 = true;
				System.out.println(pn + "是合数，它的约数有：" + i);
			}
		}
		if (b1 == false){
			System.out.println(pn + "是一个质数");
		}
		
		

		
		//输出n以内的质数
		/*
		System.out.println("请输入一个正整数，将自动返回该整数范围内的质数");
		int num = scan.nextInt();
		if(num == 1){
			System.out.println("1既不是合数也不是质数，最小的质数为2，请从2开始。");
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