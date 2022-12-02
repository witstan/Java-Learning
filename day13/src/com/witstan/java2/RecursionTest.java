package com.witstan.java2;
/*
 * 
 * 递归方法的使用（了解）
 * 1.递归方法：一个方法体内调用它自身。
 * 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执 
行无须循环控制。
递归方向一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 * 
 * 
 * 
 */
public class RecursionTest {
	public static void main(String[] args) {
	
		//例1：计算1-100之间自然数的和
		//方式一
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
		}
		System.out.println(sum);
		
		//例1：计算1-100之间自然数的积
		//方式一
		int pro = 1;
		for(int i = 1; i <= 10; i++){
			pro *= i;
		}
		System.out.println(pro);
		
		
		//方式二
		RecursionTest test = new RecursionTest();
		int sum1 = test.getSum(100);
		System.out.println(sum1);
		
		//例2：计算1-n之间自然数的积:n!
		int pro1 = test.getPro(10);
		System.out.println(pro1);
		
		System.out.println("****************************");
		
		//例3
		int f = test.f(10);
		System.out.println(f);
		
		//例4
		int fi = test.Fibonacci(7);
		System.out.println(fi);
		
	}
	
	//例1：计算1-n之间自然数的和:n!
	public int getSum(int n){
		if(n == 1){
			return 1;
		}else{
			return n + getSum(n - 1);
		}
	}
	
	
	//例2：计算1-n之间自然数的积:n!
	public int getPro(int n){
		if(n == 1){
			return 1;
		}else{
			return n * getPro(n - 1);
		}
	}
	
	//例3：已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0 
	//的整数，求f(10)的值。
	public int f(int n){
		if(n == 0){
			return 1;
		}else if(n == 1){
			return 4;
		}else{
			return 2*f(n - 1) + f(n - 2);
		}
	}
	
	//例4:斐波那契数列
	public int Fibonacci(int n){
		if(n == 1){
			return 0;
		}else if(n == 2){
			return 1;
		}else{
			return Fibonacci(n - 1) + Fibonacci(n - 2);
			
		}
	}
	
	//例5：汉诺塔问题
	
	//例6：快排
	
	
}
