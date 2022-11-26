package com.witstan.homework;

import java.util.Arrays;

/*
 *  int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
 * 反转上述数组
 * 
 */
public class Homework02 {
	public static void main(String[] args) {
		int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		for(int i = 0, j = arr.length - 1; i < j; i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
