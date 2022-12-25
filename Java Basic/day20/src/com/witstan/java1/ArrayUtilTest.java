package com.witstan.java1;

import java.util.Arrays;

public class ArrayUtilTest {
	public static void main(String[] args) {
		
		//ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{32,34,3,0,43,-98,-4,352,1,-8};
		
		int maxValue = ArrayUtil.getMax(arr);
		System.out.println(maxValue);
		
		int minValue = ArrayUtil.getMin(arr);
		System.out.println(minValue);
		
		int sumValue = ArrayUtil.getSum(arr);
		System.out.println(sumValue);
		
		int avgValue = ArrayUtil.getAvg(arr);
		System.out.println(avgValue);
		
		System.out.println("***************reverse***************");
		ArrayUtil.reverse(arr);
		ArrayUtil.print(arr);
		
		System.out.println("***************copy***************");
		ArrayUtil.print(ArrayUtil.copy(arr));
		
		System.out.println("***************sort***************");
		ArrayUtil.sort(arr);
		ArrayUtil.print(arr);
		
		
		int index = ArrayUtil.search(arr, -98);
		System.out.println(index);
	}
}


