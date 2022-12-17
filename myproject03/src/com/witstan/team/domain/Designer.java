package com.witstan.team.domain;

public class Designer extends Programmer {

	private double bonus;

	
	public Designer() {
		super();
	}
	
	public Designer(int id, String name, int age, double salary, Equipment equipment, Double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + "设计师" + "\t" + getStatus().getNAME() + "\t" + getBonus() + "\t\t" + getEquipment().getDsecription();
	}
	
	@Override
	public String toTeamString() {
		return getMenmberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + "设计师" + "\t" + getBonus();
	}
	
	
	
}
