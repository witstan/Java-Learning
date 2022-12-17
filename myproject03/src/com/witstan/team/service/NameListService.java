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

	public NameListService() {
		this.employees = new Employee[Data.EMPLOYEES.length];
		for (int i = 0; i < Data.EMPLOYEES.length; i++) {
			if (Integer.parseInt(Data.EMPLOYEES[i][0]) == Data.EMPLOYEE) {
				employees[i] = new Employee(Integer.parseInt(Data.EMPLOYEES[i][1]), Data.EMPLOYEES[i][2],
						Integer.parseInt(Data.EMPLOYEES[i][3]), Double.parseDouble(Data.EMPLOYEES[i][4]));
			}
			if (Integer.parseInt(Data.EMPLOYEES[i][0]) == Data.PROGRAMMER) {
				employees[i] = new Programmer(Integer.parseInt(Data.EMPLOYEES[i][1]), Data.EMPLOYEES[i][2],
						Integer.parseInt(Data.EMPLOYEES[i][3]), Double.parseDouble(Data.EMPLOYEES[i][4]),
						new Equipment() {
							@Override
							public String getDsecription() {
								// TODO Auto-generated method stub
								return null;
							}
						});
			}
			if (Integer.parseInt(Data.EMPLOYEES[i][0]) == Data.DESIGNER) {
				employees[i] = new Designer(Integer.parseInt(Data.EMPLOYEES[i][1]), Data.EMPLOYEES[i][2],
						Integer.parseInt(Data.EMPLOYEES[i][3]), Double.parseDouble(Data.EMPLOYEES[i][4]),
						new Equipment() {
							@Override
							public String getDsecription() {
								// TODO Auto-generated method stub
								return null;
							}
						}, Double.parseDouble(Data.EMPLOYEES[i][5]));
			}
			if (Integer.parseInt(Data.EMPLOYEES[i][0]) == Data.ARCHITECT) {
				employees[i] = new Architect(Integer.parseInt(Data.EMPLOYEES[i][1]), Data.EMPLOYEES[i][2],
						Integer.parseInt(Data.EMPLOYEES[i][3]), Double.parseDouble(Data.EMPLOYEES[i][4]),
						new Equipment() {
							@Override
							public String getDsecription() {
								// TODO Auto-generated method stub
								return null;
							}
						}, Double.parseDouble(Data.EMPLOYEES[i][5]), Integer.parseInt(Data.EMPLOYEES[i][6]));
			}
			for (int j = 1; j < Data.EQUIPMENTS.length; j++) {
				if (Integer.parseInt(Data.EQUIPMENTS[j][0]) == Data.PC) {
					if (employees[j] instanceof Programmer) {
						Programmer p = (Programmer) employees[j];
						p.setEquipment(new PC(Data.EQUIPMENTS[j][1], Data.EQUIPMENTS[j][2]));
					}
				}
				if (Integer.parseInt(Data.EQUIPMENTS[j][0]) == Data.NOTEBOOK) {
					if (employees[j] instanceof Programmer) {
						Programmer p = (Programmer) employees[j];
						p.setEquipment(new NoteBook(Data.EQUIPMENTS[j][1], Double.parseDouble(Data.EQUIPMENTS[j][2])));
					}
				}
				if (Integer.parseInt(Data.EQUIPMENTS[j][0]) == Data.PRINTER) {
					if (employees[j] instanceof Programmer) {
						Programmer p = (Programmer) employees[j];
						p.setEquipment(new Printer(Data.EQUIPMENTS[j][1], Data.EQUIPMENTS[j][2]));
					}
				}
			}
		}
	}

	public Employee[] getAllEmployees() {
		return employees;
	}

	public Employee getEmployee(int id) throws TeamException {
		for(int i = 0; i < employees.length; i++){
			if(employees[i].getId() == id){
				return employees[i];
			}	
		}
		throw new TeamException("找不到指定的员工");
	}


	public static void main(String[] args) {

		NameListService test = new NameListService();
		for(int i = 0; i < test.employees.length; i++){
			System.out.println(test.employees[i].toString());
		}
		try {
			System.out.println(test.getEmployee(5).getName());
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
