/*
For循环结构的使用
一、循环结构的4要素
①初始化条件
②循环条件 --->boolean类型
③循环体
④迭代条件

二for循环的结构

for(①;②;④){
	③
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - …… -②（false）退出
*/

class ForTest {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5 ; i++ ){
			System.out.println("Hello World!");
		}

		//练习：
		int num = 1;
		for (System.out.print('a');num <= 3;System.out.print('c'),num++ ){
			System.out.print('b');
		}

		System.out.println();

		//例题：遍历100以内的偶数,输出所有偶数的和
		int sumEven = 0;//记录所有偶数的和
		int countEven = 0;//记录偶数的个数
		for (int i = 1;i <= 40;i++ ){
			if (i % 2 == 0){
				System.out.println(i);
				sumEven += i;
				countEven++;
			}
		}
		System.out.println("所有偶数和为：" + sumEven);
		System.out.println("偶数个数为：" + countEven);



		//方式二:
		for (int i = 2;i <= 20 ; i += 2 ){
			System.out.println(i);
		}
	}
}
