package com.witstan.exer;
/*
 *（2）MyDate类包含:
private成员变量year,month,day ；
toDateString()方法返回日期对应的字符串：xxxx年xx月xx日
 * 
 */
public class MyDate {
		
		private int year;
		private int month;
		private int day;
		
		public MyDate(){
			
		}
	
		public MyDate(int year, int month, int day) {
			if(year >= 2006 || year <= 1912 || month < 1 || month > 12 || day < 1 || day > 31){
				//抛出异常 还没学
			}else{
				//暂时不考虑月份对应的日期，懒得写了……
				this.year = year;
				this.month = month;
				this.day = day;
			}
			
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public String toDateString() {
			return year + "年" + month + "月" + day + "日";
		}
		
}
