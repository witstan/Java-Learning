package com.witstan.exer;
/*
 *  (1)定义一个ManKind类，包括
 成员变量int sex和int salary；
 方法void manOrWoman()：根据sex的值显示“man”(sex==1)或者“woman”(sex==0)；
 方法void employeed()：根据salary的值显示“no job”(salary==0)或者“  job”(salary!=0)。

 */
public class ManKind {
	
	int sex;
	int salary;
	
	public ManKind(){
		
	}
	
	public void manOrWoman(){
		switch(sex){
			case 1:
				System.out.println("man");
				break;
			case 0:
				System.out.println("woman");
			}
	}
	
	public void employeed(){
		switch(salary){
			case 0:
				System.out.println("no job");
				break;
			default:
			//how about minus? pay to work?
				System.out.println("job");
		}
	}
	
	
}
