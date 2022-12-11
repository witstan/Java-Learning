package com.witstan.exer;

/*
 * （4）参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的 
员工处理。该类包括：private成员变量wage和hour；
实现父类的抽象方法earnings(),该方法返回wage*hour值； 
toString()方法输出员工类型信息及员工的name，number,birthday。
 * 
 */
public class HourlyEmployee extends Employee {

	private double hour;
	private double wage;

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public HourlyEmployee() {

	}

	public HourlyEmployee(String name, int number, MyDate birthday, double hour, double wage) {
		super(name, number, birthday);
		this.hour = hour;
		this.wage = wage;
	}

	@Override
	public double earnings(int month) {
		if (month == this.getBirthday().getMonth()) {
			return wage * hour + 100;
		}
		return wage * hour;
	}

	@Override
	public String toString(int month) {
		if(month == this.getBirthday().getMonth()){
			return "HourlyEmployee [name=" + getName() + ", number=" + getNumber() + ", birthday=" + getBirthday().toDateString() + ", salary =" + earnings(month) + " 100元生日红包!" + "]";
		}
		return "HourlyEmployee [name=" + getName() + ", number=" + getNumber() + ", birthday=" + getBirthday().toDateString() + ", salary =" +  earnings(month) + "]";
	}

}
