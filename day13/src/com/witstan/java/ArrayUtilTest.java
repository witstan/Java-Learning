package com.witstan.java;

import java.util.Arrays;

public class ArrayUtilTest {
	public static void main(String[] args) {
		
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{32,34,3,0,43,-98,-4,352,1,-8};
		
		int maxValue = util.getMax(arr);
		System.out.println(maxValue);
		
		int minValue = util.getMin(arr);
		System.out.println(minValue);
		
		int sumValue = util.getSum(arr);
		System.out.println(sumValue);
		
		int avgValue = util.getAvg(arr);
		System.out.println(avgValue);
		
		System.out.println("***************util.reverse***************");
		util.reverse(arr);
		util.print(arr);
		
		System.out.println("***************util.copy***************");
		util.print(util.copy(arr));
		
		System.out.println("***************util.sort***************");
		util.sort(arr);
		util.print(arr);
		
		
		int index = util.search(arr, -9884);
		System.out.println(index);
	}
}


