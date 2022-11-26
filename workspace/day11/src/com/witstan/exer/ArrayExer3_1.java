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
		
		for(int index = 1; index <= (num*num); index++){
			
			if(direc == 1){												//in15		
				// 4
				if(y < num && arr[x][y] == 0){// y<4					// y<4
					arr[x][y] = index;//in4 x0 y3 arr[0][3] 4			//in14 x1 y2 arr[1][2] in14
					y++;//y4											//y3
				}else{//in5 x0 y4 arr[0][3]4
					direc = 2;
					x++;//x1
					y--;//y3
					index--;//in4	
				}
				
			}else if(direc == 2){//in8
				
				if(x < num && arr[x][y] == 0){// x<4
					arr[x][y] = index;//in7 x3 y3 arr[3][3] in7
					x++;//x4
				}else{//in8
					direc = 3;
					x--;//x3
					y--;//y2
					index --;//in7
				}
				
			}else if(direc == 3){//in11
				
				if(y >= 0 && arr[x][y] == 0){//y>=0  arr[3][0] == 0
					arr[x][y] = index;//in10 x3 y0 arr[3][0] in10
					y--;//y-1
				}else{//in11
					direc = 4;
					y++;//y0
					x--;//x2
					index--;//in10
				}
				
			}else if(direc == 4){//in13
				
				if(x >= 0 && arr[x][y] == 0){//x>=0  arr[1][0] == 0
					arr[x][y] = index;//in12 x1 y0 arr[1][0] in12
					x--;//x0
				}else{//in13
					direc = 1;
					y++;//x1
					x++;//y1
					index--;//in12
				}
				
			}
	
		}		
		
			
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				
				System.out.print(arr[i][j] + "\t");
					
				}
			System.out.println();					
			}
			
		}
		
		
	}

