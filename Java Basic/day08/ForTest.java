/*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。 
比如：12和20的最大公约数是4，最小公倍数是60。
说明：break关键字的使用
*/

import java.util.Scanner;

class ForTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个正整数：");
		int m = scan.nextInt();
		System.out.println("请输入第二个正整数：");
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
		
		//(m > n)? (big = m, small = n): (big = n, small = m); 语法编译过不了，哈哈
		//以下输出最大公约数greatest common divisor，gcd
		int gcd = 1;
		for (int sub = small; sub > 0; sub--){
			if (small % sub == 0 && big % sub == 0){
				gcd = sub;
				sub = -1;
				//使用break就可以了，议一旦在循环中执行到break，就跳出循环。
			}	
		}
		//以下输出最小公倍数least common multiple，lcm
		int lcm = big;
		for (int mul = big; mul <= big*small; mul++){//两者lcm一定小于等于两数之积
		//for (int mul = big; mul > 0; mul++){ 原始写法
			if (mul % big == 0 && mul % small == 0){
				lcm = mul;
				mul = -1;//break
				
			}	
		}

		System.out.println(m + "和" + n + "的最大公约数为：" + gcd + ",最小公倍数为：" + lcm);	
	}
}
