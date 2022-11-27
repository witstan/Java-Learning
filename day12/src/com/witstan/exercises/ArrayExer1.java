package com.witstan.exercises;
import java.util.Arrays;
/*
 * 定义一个N*N二维数组，从键盘上输入值，找出每行中最大值组成一个一维数组并输出
 * 
 */
import java.util.Scanner;

public class ArrayExer1 {
	public static void main(String[] args) {
		
		System.out.println("请输入一个整数：");
		Scanner scan = new Scanner(System.in);
		int lens = scan.nextInt();
		
		int[][] arr = new int[lens][lens];
		int[] arr1 = new int[lens];
		int max = 1;
		
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length;j++){
				
				//取值范围1~200
				arr[i][j] = (int)(Math.random()*200) + 1;
				
				//并且在同一个一维数组内元素各不相同
				for(int k = 0; k < j; k++){
					if(arr[i][j] == arr[i][k]){
						j--;
						break;
					}
				}
				
				if(arr[i][j] > max){
					max = arr[i][j];
				}
			}
			arr1[i] = max;
			max = 0;
		}
		
		
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length;j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));
	}
}
