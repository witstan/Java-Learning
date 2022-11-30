package com.witstan.java;
/*
 * 自定义数组的工具类
 * 
 * 
 */
public class ArrayUtil {
	
		//求数组的最大值
		public int getMax(int[] arr){
			
			int max = arr[0];
			for(int i = 0; i < arr.length; i++){
				if(arr[i] > max){
					max = arr[i];
				}
			}
			return max;
		}
	
		//求数组的最小值
		public int getMin(int[] arr){
			int min = arr[0];
			for(int i = 0; i < arr.length; i++){
				if(arr[i] < min){
					min = arr[i];
				}
			}
			return min;
		}
	
		//求数组的总和
		public int getSum(int[] arr){
			int sum = 0;
			for(int i = 0; i < arr.length; i++){
				
					sum += arr[i];
				
			}
			return sum;
		}
		
	
		//求数组的平均值
		public int getAvg(int[] arr){
			return getSum(arr) / (arr.length);
		}
	
		//反转数组
		public void reverse(int[] arr){
			for(int i = 0, j = arr.length - 1;i < j;i++, j--){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	
		//复制数组
		public int[] copy(int[] arr){
			int[] arr1 = new int[arr.length];
			for(int i = 0;i < arr1.length;i++){
				arr1[i] = arr[i];
			}
			return arr1;
		}
	
		//数组排序
		public void sort(int[] arr){
			for(int i = 0;i < arr.length - 1;i++){
				
				for(int j = 0;j < arr.length - 1 - i;j++){
					
					if(arr[j] > arr[j + 1]){
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
				
			}
		}
	
		//遍历数组
		public void print(int[] arr){
			System.out.print("[");
			for(int i = 0; i < arr.length; i++){
				if(i < arr.length - 1){
					System.out.print(arr[i] + ", ");
				}else{
					System.out.print(arr[i]);
				}
				
			}
			System.out.println("]");
		}
	
		//查找指定元素
		public int search(int[] arr, int dest){

			for(int i = 0;i < arr.length;i++){
				if(dest == arr[i]){
					return i;
				}
			}
			//如果没有查找到指定元素则返回-1
			return -1;
		}
		
		
}
