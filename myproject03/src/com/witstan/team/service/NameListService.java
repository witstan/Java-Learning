package com.witstan.team.service;

import com.witstan.team.domain.Architect;
import com.witstan.team.domain.Designer;
import com.witstan.team.domain.Employee;
import com.witstan.team.domain.Equipment;
import com.witstan.team.domain.NoteBook;
import com.witstan.team.domain.PC;
import com.witstan.team.domain.Printer;
import com.witstan.team.domain.Programmer;

public class NameListService {
	
	private Employee[] employees;
	
	public NameListService(){
		
	}
	
	public Employee[] getAllEmployees(){
		this.employees = new Employee[Data.EMPLOYEES.length];
		for(int i = 0; i < Data.EMPLOYEES.length; i++){
			if(Integer.parseInt(Data.EMPLOYEES[i][0]) == 10){
				employees[i] = new Employee(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.parseInt(Data.EMPLOYEES[i][3]),Double.parseDouble(Data.EMPLOYEES[i][4]));
			}
			if(Integer.parseInt(Data.EMPLOYEES[i][0]) == 11){
				employees[i] = new Programmer(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.parseInt(Data.EMPLOYEES[i][3]),
						Double.parseDouble(Data.EMPLOYEES[i][4]),new Equipment(){
							@Override
							public String getDsecription() {
								// TODO Auto-generated method stub
								return null;
							}
				});	
			}
			if(Integer.parseInt(Data.EMPLOYEES[i][0]) == 12){
				employees[i] = new Designer(Integer.parseInt(Data.EMPLOYEES[i][1]), Data.EMPLOYEES[i][2], Integer.parseInt(Data.EMPLOYEES[i][3]), 
						Double.parseDouble(Data.EMPLOYEES[i][4]), new Equipment(){
							@Override
							public String getDsecription() {
								// TODO Auto-generated method stub
								return null;
							}
				}, Double.parseDouble(Data.EMPLOYEES[i][5]));
			}
			if(Integer.parseInt(Data.EMPLOYEES[i][0]) == 13){
				employees[i] = new Architect(Integer.parseInt(Data.EMPLOYEES[i][1]), Data.EMPLOYEES[i][2], Integer.parseInt(Data.EMPLOYEES[i][3]), 
						Double.parseDouble(Data.EMPLOYEES[i][4]), new Equipment(){
							@Override
							public String getDsecription() {
								// TODO Auto-generated method stub
								return null;
							}
				}, Double.parseDouble(Data.EMPLOYEES[i][5]), Integer.parseInt(Data.EMPLOYEES[i][6]));
			}
			if(Integer.parseInt(Data.EQUIPMENTS[i][0]) == 21){
				if(employees[i] instanceof Programmer){
					Programmer p = (Programmer)employees[i];
					p.setEquipment(new PC(Data.EQUIPMENTS[i][1], Data.EQUIPMENTS[i][2]));
				}
			}
			if(Integer.parseInt(Data.EQUIPMENTS[i][0]) == 22){
				if(employees[i] instanceof Programmer){
					Programmer p = (Programmer)employees[i];
					p.setEquipment(new NoteBook(Data.EQUIPMENTS[i][1], Double.parseDouble(Data.EQUIPMENTS[i][2])));
				}
			}
			if(Integer.parseInt(Data.EQUIPMENTS[i][0]) == 23){
				if(employees[i] instanceof Programmer){
					Programmer p = (Programmer)employees[i];
					p.setEquipment(new Printer(Data.EQUIPMENTS[i][1], Data.EQUIPMENTS[i][2]));
				}
			}		
		}
		return employees;
	}
	
	public Employee getEmployee(int id) throws TeamException{
		if(id < employees.length && id >= 0){
			return employees[id+1];
		}else{
			throw new TeamException("找不到指定的员工");
		}
	}
	
	public static void main(String[] args) {
		
		NameListService test = new NameListService();
		
		Architect a1 = new Architect(1001, "Jane", 23, 5000, new NoteBook("Dell", 8000), 1000, 2000);
		a1.setStatus(Status.BUSY);
		System.out.println(a1.getStatus());
	
	}
	
	
}
