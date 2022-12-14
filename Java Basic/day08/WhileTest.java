/*
While循环的使用

一、循环结构的4要素
①初始化条件
②循环条件 --->boolean类型
③循环体
④迭代条件

二、while循环的结构

①
while(②){
	③；
	④；
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ② - …… - ②

说明：
1.写while循环千万小心不要丢了迭代条件。一旦丢了，就可能导致死循环。
2.写程序要避免出现死循环。
3.for循环和while循环可以相互转换。

区别： for循环和while循环的初始化条件部分的作用范围不同。

*/
class WhileTest{
	public static void main(String[] args) {
		//遍历100以内所有偶数
		int i = 1;
		while (i <= 100){
			if (i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}
		//出了while循环仍可以调用
		System.out.println(i);//101
		
	}
}
