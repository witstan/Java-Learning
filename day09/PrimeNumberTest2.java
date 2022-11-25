/*
100以内所有质数输出。实现方式二
质数：素数，只能被1和它本身整除的自然数

最小的质数是2
对PrimeNumberTest.java的优化
*/

class PrimeNumberTest2 {
	public static void main(String[] args) {
		
		//day07自己写的
		int count = 0;//记录质数个数

		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long start = System.currentTimeMillis();

		lable:for (int pn = 2; pn <= 100000; pn++){
			
			//优化二：对本身是质数的自然数是有效的。
			for (int i = 2; i <= Math.sqrt(pn); i++){
			//for (int i = 2; i < pn; i++){
				
				if (pn % i == 0){
					continue lable;
				}
			}
			
			count++;
		}

		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long end = System.currentTimeMillis();
		
		System.out.println("质数的个数为：" + count);
		System.out.println("所花费的时间为：" + (end - start));// 13939 - 优化一：break 1221 - 优化二：Math.sqrt() 11
	}
}
