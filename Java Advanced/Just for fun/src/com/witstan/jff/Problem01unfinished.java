package com.witstan.jff;

import java.util.Arrays;

public class Problem01unfinished {

	public static void main(String[] args) {

		int[] array = new int[] { -19, 99, 73, -36, -24, 66, 16, 101, 36, -18, 23, 3, 37, -88, -18 };
		int i = -36;
		
//		int[] a2 = Arrays.copyOf(array, array.length);
//		Arrays.sort(a2);
//		System.out.println(Arrays.toString(a2));//[-88, -23, -19, -1, 3, 7, 16, 23, 36, 37, 66, 66, 73, 99, 101]
		
		int[] a = Problem01unfinished.findIndext1(array, i);
		System.out.println(Arrays.toString(a));
		
		
		
		
//		int[] arr = Problem01unfinished.findIndext(array, i);
//		System.out.println(Arrays.toString(arr));

	}
	
//	public static int[] findIndext1(int[] array, int num) {
//		
//		int[] a2 = Arrays.copyOf(array, array.length);
//		Arrays.sort(a2);
//		
//		if(a2[a2.length - 1] > num){
//			for()
//		}
//		if(a2[a2.length - 1] == num){
//			
//		}
//	}
	
	
	
	
	
	/*
	 * (-∞,- 0]   [1, num / 2]    [num / 2, num)  [num, ∞)
	 * 
	 */
	public static int[] findIndext1(int[] array, int num) {
//		long start = System.currentTimeMillis();
		for(int i = 0; i < array.length; i++){
			if(array[i] <= 0){
				for(int j = 0; j <array.length; j++){
					if(array[j] < num){
						continue;
					}
					if (array[i] + array[j] == num && i != j) {
//						long end = System.currentTimeMillis();
//
//						System.out.println("cost time: " + (end - start));
						return new int[] {i, j};
					}
				}
			}
			
			if(array[i] >= 1 && array[i] <= num / 2){
				for(int j = 0; j <array.length; j++){
					if(array[j] < num / 2 && array[j] > num){
						continue;
					}
					if (array[i] + array[j] == num && i != j) {
//						long end = System.currentTimeMillis();
//
//						System.out.println("cost time: " + (end - start));
						return new int[] {i, j};
					}
				}
			}
			
		}
		
		return null;
	}
	

}
