package com.witstan.homework;
/*
 * int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
 * 使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
 * 
 */
public class Homework04 {
	public static void main(String[] args) {
		
		int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		

		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 22){
				System.out.println("22的所在位置为：" + i);
				break;
			}
		}

	}
}
