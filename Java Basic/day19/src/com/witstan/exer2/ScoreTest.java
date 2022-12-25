package com.witstan.exer2;

import java.util.Scanner;
import java.util.Vector;

/*
 * 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出 
最高分，并输出学生成绩等级。
提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的 长度。
而向量类java.util.Vector可以根据需要动态伸缩。

创建Vector对象：Vector v=new Vector();
给向量添加元素：v.addElement(Object obj);   //obj必须是对象
取出向量中的元素：Object  obj=v.elementAt(0);
 注意第一个元素的下标是0，返回值是Object类型的。
计算向量的长度：v.size();
若与最高分相差10分内：A等；20分内：B等； 
30分内：C等；其它：D等
 * 
 * 
 */

public class ScoreTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生成绩，以负数代表输入结束：");
		
		Vector v = new Vector();
		
		boolean isFlag = true;
		int maxscore = 0;
		while(isFlag){
			int i = scan.nextInt();
			if(i > maxscore){
				maxscore = i;
				v.addElement(new Integer(i));
				//v.addElement(i);
			}else if(i >= 0){
				v.addElement(new Integer(i));			
			}else{
				isFlag = false;
			}
			//考虑输入分数大于100的情况
		}
		
		for(int i = 0; i < v.size(); i++){
			Object obj = v.elementAt(i);
			int j = (Integer)obj;
			if(maxscore - j <= 10){
				System.out.println("分数为：" + j + "，等级为A等");
			}else if(maxscore - j <= 20){
				System.out.println("分数为：" + j + "，等级为B等");
			}else if(maxscore - j <= 30){
				System.out.println("分数为：" + j + "，等级为C等");
			}else{
				System.out.println("分数为：" + j + "，等级为D等");
			}
		}
		
	}
}
