package com.witstan.exercises;
/*
 * 创建一个char类型的26个元素的数组，分别 放置'A'-'Z'。
 * 使用for循环访问所有元素并打印出来。
 * 
 */
public class ArrayExer {
	public static void main(String[] args) {
		
		char[] arr = new char[26];
		for (int i = 0; i < arr.length; i++){
			arr[i] = (char)(i + 65);
			System.out.print(arr[i] + " ");
		}

	}
}
