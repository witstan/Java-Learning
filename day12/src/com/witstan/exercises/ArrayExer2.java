package com.witstan.exercises;
import java.util.Arrays;
/*
 * 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * 
 * （先随机生成一个元素数量为10，取值范围[1,100]的数组，然后将其排序）
 * 
 */
import java.util.Scanner;

public class ArrayExer2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数组的长度：");
		int length = scan.nextInt();
		
		int[] arr = new int[length];
		
		//随机赋值
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100 + 1);
		}
		System.out.println("随机生成的原始数组为：" + Arrays.toString(arr));
		
		//冒泡排序
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - i - 1;j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("排序后的数组为：" + "            " +  Arrays.toString(arr));
		
		
		System.out.println("请输入一个1~100的整数：");
		int num = scan.nextInt();
		
		int[] arr1 = new int[arr.length + 1];
			
		//解答方式一：	
		/*if(arr[0] >= num){
			arr1[0] = num;
			for(int i = 1; i < arr1.length; i++){
				arr1[i] = arr[i - 1];
			}
		}else if(arr[arr.length - 1] <= num){
			arr1[arr1.length - 1] = num;
			for(int i = 0; i < arr1.length - 1; i++){
				arr1[i] = arr[i];
			}
		}else{
			
			for(int i = 0; i < arr.length; i++){
				
				if(arr[i] < num){
					
					arr1[i] = arr[i];
					
				}else{
					arr1[i] = num;
					num = arr[i];
					arr1[i + 1] = num;
				}
			}
		}*/
		
		//解答方式二：简单使用单层冒泡排序，如下
		
		/*arr1[0] = num;
		for(int i = 1; i < arr1.length; i++){
			arr1[i] = arr[i - 1]; 
		}
		
		for(int i = 0; i < arr1.length - 1; i++){
			if(arr1[i] > arr1[i + 1]){
				int temp = arr1[i];
				arr1[i] = arr1[i + 1];
				arr1[i + 1] = temp;
			}
		}*/
		
		//解答方式三，也很简便：
		arr1[0] = num;
		for(int i = 0; i < arr1.length - 1; i++){
		
			num = arr[i];
			
			if(arr1[i] <= num){
				
				arr1[i + 1] = num;
				
			}else{
				
				arr1[i + 1] = arr1[i];
				arr1[i] = num;
			}
		}
		
		
		
		
		System.out.println(Arrays.toString(arr1));
		
	}
}
