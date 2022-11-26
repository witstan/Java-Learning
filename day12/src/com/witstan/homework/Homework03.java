package com.witstan.homework;

import java.util.Arrays;

/*int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
 * 复制上述数组，得到一个新的数组
 * 
 */
public class Homework03 {
	public static void main(String[] args) {
		int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
