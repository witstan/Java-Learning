package com.witstan.exer;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee[] e1 = new Employee[10];
		e1[0] = new SalariedEmployee("Tom", 1001,new MyDate(1990,2,1), 2000);
		e1[1] = new HourlyEmployee("Tina", 1002, new MyDate(1993,3,15), 30, 20);
		e1[2] = new HourlyEmployee("Timmy", 1003, new MyDate(1940,4,25), 30, 15);
		e1[3] = new HourlyEmployee("Tim", 1004, new MyDate(1970,9,1), 35, 25);
		e1[4] = new SalariedEmployee("Teresa", 1005,new MyDate(2001,12,21), 3000);
		e1[5] = new SalariedEmployee("Tara", 1006,new MyDate(1989,11,11), 3000);
		e1[6] = new SalariedEmployee("Tanya", 1007,new MyDate(2001,1,1), 3500);
		e1[7] = new SalariedEmployee("Trace", 1008,new MyDate(1931,8,18), 4500);
		
		SalariedEmployee s1009 = new SalariedEmployee("Tuck",1009,new MyDate(1967,10,30),3450);
		e1[8] = s1009;
		s1009.setMonthlySalary(3600);
		HourlyEmployee h1003 = (HourlyEmployee)e1[2];
		h1003.setWage(16);
		
		//方式一
//		System.out.println("please enter current month: (1-12)");
//		int month = scan.nextInt();
		
		//方式二
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH);
		
		
		for(int i = 0; i < e1.length; i++){
			if(e1[i] == null){
				break;
			}
			e1[i].earnings(month + 1);
			String s = e1[i].toString(month + 1);
			System.out.println(s);
			
		}
	}
}
