package com.witstan.team.service;

import com.witstan.team.domain.Programmer;

public class TeamService {

	private int counter = 1;
	private final int MAX_MEMBER = 5;
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int total = 0;
	
	public Programmer[] getTeam(){
		return team;
	}
	
	public void addMember throws TeamException(){
		
	}
	
	public void removeMember(int menberId) throws TeamException(){
		
	}
	
	
}
