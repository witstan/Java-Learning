package com.witstan.team.service;

import com.witstan.team.service.Status;
import com.witstan.team.domain.Architect;
import com.witstan.team.domain.Designer;
import com.witstan.team.domain.Employee;
import com.witstan.team.domain.Programmer;

public class TeamService {

	private int counter = 1;
	private final int MAX_MEMBER = 5;
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int total = 0;

	public Programmer[] getTeam() {
		Programmer[] currentTeam = new Programmer[total];
		for(int i = 0; i < currentTeam.length; i++){
			currentTeam[i] = team[i];
		}
		return currentTeam;
	}

	public void addMember(Employee e) throws TeamException{
		

		if(total >= MAX_MEMBER){
			throw new TeamException("成员已满，无法添加");
		}
		
		if(!(e instanceof Programmer)){
			throw new TeamException("该成员不是开发人员，无法添加");
		}
		
		
		if(isInTeam(e)){
			throw new TeamException("该员工已在本开发团队中");
		}
		
		Programmer p = (Programmer)e;
		
		if(p.getStatus() == Status.BUSY){
			throw new TeamException("该员工已是某团队成员");
		}
		
		if(p.getStatus() == Status.VACATION){
			throw new TeamException("该员正在休假，无法添加");
		}
				
		if(p.getClass() == Architect.class && count(p) == 1){
			throw new TeamException("团队中至多只能有一名架构师");	
		}
			
		if(p.getClass() == Designer.class && count(p) == 2){
			throw new TeamException("团队中至多只能有两名设计师");	
		}
		
		if(p.getClass() == Programmer.class && count(p) == 3){
			throw new TeamException("团队中至多只能有三名设计师");	
		}
		
		
		p.setMenmberId(counter++);
		team[total++] = p;	
		p.setStatus(Status.BUSY);
		
	}

	 public void removeMember(int menberId) throws TeamException{
		 boolean notInTeam = true;
		
		 int index = 0;
		
		 for(int i = 0; i < total; i++){
			 if(team[i].getMenmberId() == menberId){ 
				 index = i;
				 notInTeam = false;
				 team[i].setStatus(Status.FREE);
				 break;
			 }	 
		 }
		 if(!notInTeam){
			 for(int i = index; i < total; i++){
			 if(i + 1 < total && team[i + 1] != null){
				 team[i] = team[i + 1];
			 }
			 team[--total] = null;
			 }
		 }else{
			  throw new TeamException("找不到指定memberId的员工，删除失败");
		 } 
	 }

	private boolean isInTeam(Employee e) {
		for (int i = 0; i < total; i++) {
			if (team[i] == e) {
				return true;
			}
		}
		return false;
	}

	private int count(Programmer p){
		int ArchitectCount = 0, DesignerCount = 0, ProgrammerCount = 0;
		
		for(int i = 0; i < total; i++){
			if(team[i].getClass() == Architect.class){
				ArchitectCount++;
			}
			if(team[i].getClass() == Designer.class){
				DesignerCount++;
			}
			if(team[i].getClass() == Programmer.class){
				ProgrammerCount++;
			}
		}
		
		if(p.getClass() == Architect.class){
			return ArchitectCount;
		}
		if(p.getClass() == Designer.class){
			return DesignerCount;
		}
		return ProgrammerCount;
		
	}

}
