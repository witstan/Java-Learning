package com.witstan.exer;

public class MyDate {

	private int day;
	private int	month;
	private int year;
	
	public MyDate(int i, int j, int k) {
		day = i;
		month = j;
		year = k;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		if(obj instanceof MyDate){
			MyDate d = (MyDate)obj;
			return this.day == d.day && this.month == d.month && this.year == d.year;
		}
		return false;
	}

}
