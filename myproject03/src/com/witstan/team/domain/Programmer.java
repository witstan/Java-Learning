package com.witstan.team.domain;

import com.witstan.team.service.Status;

public class Programmer extends Employee {

	private int menmberId;
	private Status status = Status.FREE;
	private Equipment equipment;
	
	public Programmer(){
		
	}
	
	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}

	public int getMenmberId() {
		return menmberId;
	}

	public void setMenmberId(int menmberId) {
		this.menmberId = menmberId;
	}


	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status string) {
		this.status = string;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + "程序员" + "\t" + status.getNAME() + "\t\t\t" + equipment.getDsecription();
	}
	
	public String toTeamString() {
		return getMenmberId() + "/" + super.toString() + "\t" + "程序员";
	}
	
	
	
}
