package com.witstan.exer;
/*
 * 从键盘输入一个整数（1~20） 
则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。例如： 输入数字2，则程序输出：
1 2 
4 3 
输入数字3，则程序输出：
1 2 3 
8 9 4 
7 6 5 
输入数字4， 则程序输出： 
1   2   3   4 
12  13  14  5 
11  16  15  6 
10  9   8   7
输入数字5， 则程序输出： 
1  2  3  4  5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9

 */

import java.util.Scanner;

public class ArrayExer3unfinished {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个1~20的整数：");
		int num = scan.nextInt();
		switch(num){
		case 1://当整数为1时，结果只有1
			System.out.println(num);
			break;
		default:
			//当整数不为1时，结果为一个外层数组和内存数组的元素数量都是n的数组
			
			int[][] arr = new int[num][num];
			
			//构建数组
			//最后一个数组的第一个元素为num+（num-1 +（num-1）=num*3-2，并且元素逐次减1
			
			//当整数大于2时，第二个数组的第一个元素为最后一个数组的第一个元素加上（num-2），也就是num*3-2+（num-2）=num*4-4，并且元素逐次加1直到倒数第2项，倒数第1项则为num+1
			
			//当整数大于3时，第三个数组的第一个元素为最后一个数组的第一个元素加上（num-3），也就是num*3-2+（num-2）=num*4-5，
			//从第二项开始为倒数第1项则为num+2
			
			
			/*for(int i = 0;i < arr.length;i++){
				for(int j = 0;j < arr[i].length;j++){*/
					
			for(int len = 0;len <= num*num;len++){
				int i = 0, j = 0;
				if(len <  )
				arr[len][j] = j + 1;//给第一个数组赋值
					
				arr[i++][num - 1] = num + 1;
					
					 
			}
					
	
			
			//遍历数组
			for(int i = 0;i < arr.length;i++){
				for(int j = 0;j < arr[i].length;j++){
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}//switch-case
		}

}


/*//第二个数组赋值
		if(num > 2 && j < num - 1){
			arr[1][j] = num * 4 - 4 + j;
		}else{
			arr[1][j] = num + 1;
		}
		
		//第二个数组赋值
		if(num > 3 && j < num - 1){
			arr[2][j] = num * 4 - 5 + j;
		}else{
			arr[2][j] = num + 2;
		} 
		*/		
		
		//最后一个数组的第一个元素为num + （num - 1） + （num - 1） = num*3 - 2
		//arr[num - 1][j] = num*3 - 2 - j;
		/*if(i == num - 1){
			arr[i][j] = num*3 - 2 - j;
		}*/
