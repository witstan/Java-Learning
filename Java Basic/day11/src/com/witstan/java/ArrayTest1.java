package com.witstan.java;
/*
 * 算法的考察：求数值型数组中元素的最大值、最小值、平均数、总和等
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数， 
然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。 
要求：所有随机数都是两位数。
 * 
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		//声明并初始化长度为10的int型一维数组和要求的值
		int[] arr = new int[10];
		int max = 0;
		int min = 99;
		int sum = 0;
		String arrstr = "该数组的元素有：";
		//为数组赋值两位数（10~99）的随机数
		for(int i = 0;i < arr.length;i++){
			
			arr[i] = (int)(Math.random()*90) + 10;
			arrstr += arr[i];
			arrstr += ", ";
			
			if(arr[i] > max){
				max = arr[i];
			}
			
			if(arr[i] < min){
				min = arr[i];
			}
			
			sum += arr[i];
			
		}
		double avg = (double)sum / (double)arr.length;
		
		//数组求值
		System.out.println(arrstr);
		System.out.println("该数组元素中最大值为:" + max);
		System.out.println("该数组元素中最小值为:" + min);
		System.out.println("该数组元素和为:" + sum);
		System.out.println("该数组元素平均值为:" + avg);

	}
}
