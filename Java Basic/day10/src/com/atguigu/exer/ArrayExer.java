package com.atguigu.exer;

import java.util.Scanner;

/*
 * 从键盘读入学生成绩，找出最高分， 
并输出学生成绩等级。
成绩>=最高分-10   等级为’A’ 
成绩>=最高分-20   等级为’B’
成绩>=最高分-30   等级为’C’ 
其余
等级为’D’
提示：先读入学生人数，根据人数创建int数组， 
存放学生成绩。
 * 
 */
public class ArrayExer {
	public static void main(String[] args) {
		//1.使用Scanner读取学生个数。
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int number = scan.nextInt();
		
		//2.创建数组存储学生成绩：动态初始化
		int[] scores = new int[number];
		
		//3.给数组中的元素赋值
		System.out.println("请输入" + number + "个学生成绩：");
		int maxScore = 0;
		for(int i = 0;i < scores.length;i++){
			scores[i] = scan.nextInt();
			//4.获取数组中的元素的最大值
			if(maxScore < scores[i]){
				maxScore = scores[i];
			}
		}
		
		//5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
		for(int i = 0;i < scores.length;i++){
			if(maxScore - scores[i] <= 10){
				System.out.println("student " + i + " score is " + scores[i] + " grade is A");
			}else if(maxScore - scores[i] <= 20){
				System.out.println("student " + i + " score is " + scores[i] + " grade is B");
			}else if(maxScore - scores[i] <= 30){
				System.out.println("student " + i + " score is " + scores[i] + " grade is C");
			}else{
				System.out.println("student " + i + " score is " + scores[i] + " grade is D");
			}
		}
		
		
		
	}
}
