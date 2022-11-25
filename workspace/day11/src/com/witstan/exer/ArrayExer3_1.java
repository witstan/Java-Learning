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

public class ArrayExer3_1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个1~20的整数：");
		int num = scan.nextInt();
		
		int[][] arr = new int[num][num];
		
		int direc = 1;
		
		int x = 0, y = 0;
		
		for(int index = 0; index < num*num; index++){
			
			if(direc == 1){
				if(y < num){
					arr[x][y] = index + 1;
					y++;	
				}else{
					direc = 2;
					y = num - 1;
					
				}
			}
			// x = 0, y = num - 1
			
			if(direc == 2){
				if(x < num){
					arr[x][y] = index + 1;
					x++;
				}else{
					direc = 3;
					x = num - 1;
					y -= 1;
				}
			}
			// x = num - 1, y = num - 2
			
			/*if(direc == 3){
				if(y > 0){
					arr[x][y] = index + 1;
					y--;
				}else{
					direc = 4;
					y = 0;
				}
			}*/
			// x = num - 1, y = 0
			
			/*if(direc == 4){
				if(x > 0){
					arr[x][y] = index + 1;
					x--;
				}else{
					direc = 1;
					y += 1;
				}
			}*/
			// x = 1, y = 1
				
				
				
		}		
		
		
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				
				System.out.print(arr[i][j] + " ");
					
				}
			System.out.println();					
			}
			
		}
		
		
	}

