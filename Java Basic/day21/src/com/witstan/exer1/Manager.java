package com.witstan.exer1;
/*
 * 对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
 * 
 */
public class Manager extends Employee {

	private double bonus;
	
	public Manager(){
		
	}	
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("manager work");

	}

}
