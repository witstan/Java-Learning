package com.witstan.exer;
/*
 * 创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。
 * 同时，要求元素的值各不相同。
 * 
 */
public class ArrayExer2 {
	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		for(int i = 0;i < 6;i++){
		//给数组的元素从1-30中随机赋值
		arr[i] = (int)(Math.random()*30) + 1;
		//设置当arr元素数量大于1时的循环结构以判断当前生成的随机数
		//是否和之前的所有元素相同，如果相同，重新赋值
			for(int j = 0;j < i;j++){
				if(arr[i] == arr[j]){
					i--;
					break;
				}
			}
		}
		//遍历数组
		for(int i = 0;i < 6;i++){
			System.out.println(arr[i]);
		}
	}
}

