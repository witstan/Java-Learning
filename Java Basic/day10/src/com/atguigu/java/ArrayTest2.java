package com.atguigu.java;
/*
 * 二维数组的使用
 * 
 * 1.理解
 * 对于二维数组的理解，我们可以看成是一维数组 array1又作为另一个一维数组array2的元素而存 在。
 * 其实，从数组底层的运行机制来看，没有多维数组。
 * 
 * 2.二维数组的使用：
 * 	①二维数组的声明和初始化
 * 	②如何调用数组的指定位置的元素
 * 	③如何获取数组的长度
 * 	④如何遍历数组
 * 	⑤数组元素的默认初始化值: 见ArrayTest3
 * 	⑥数组的内存解析: 见ArrayTest3
 * 
 */

public class ArrayTest2 {
	public static void main(String[] args) {
	//①二维数组的声明和初始化
	int[] arr = new int[]{1,2,3};//一维数组
	//静态初始化
	int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
	//动态初始化1
	String[][] arr2 = new String[3][2];
	//动态初始化2
	String[][] arr3 = new String[3][];
	
	//其他写法
	int arr4[][] = new int[][]{{1,2,3},{4,5,9,10},{6,7,8}};
	int[] arr5[] = new int[][]{{1,2,3},{4,5},{6,7,8}};
	int[] arr6[] = {{1,2,3},{4,5},{6,7,8}};
	
	
	//②如何调用数组的指定位置的元素
	System.out.println(arr1[0][1]);//2
	System.out.println(arr2[1][1]);//null
	
	arr3[1] = new String[4];
	System.out.println(arr3[1][0]);
	
	//③如何获取数组的长度
	System.out.println(arr4.length);//3
	System.out.println(arr4[0].length);//3
	System.out.println(arr4[1].length);//4
	
	//④如何遍历数组
	for(int i = 0;i < arr4.length;i++){
		for(int j = 0;j < arr4[i].length;j++){
			System.out.print(arr4[i][j] + " ");
		}
		System.out.println();
	}
	
	
    }
}
