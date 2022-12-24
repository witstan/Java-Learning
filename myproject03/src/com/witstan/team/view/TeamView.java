package com.witstan.team.view;

import com.witstan.team.service.NameListService;
import com.witstan.team.service.TeamException;
import com.witstan.team.service.TeamService;

public class TeamView {
	
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();
	
	public void enterMainMenu(){
		boolean condition = true;
		while(condition){
			System.out.println("\n-------------------------------开发团队调度软件--------------------------------\n");
			listAllEmployees();
			System.out.println("-------------------------------------------------------------------------------");
			System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
			
			char key = TSUtility.readMenuSelection();
			
			switch(key){
			case '1':
				listTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.print("确认是否退出(Y/N)：");
				char result = TSUtility.readConfirmSelection();
				if(result == 'N'){
					break;
				}
				condition = false;
			}
				
			}
			
		}
		
	
	private void listAllEmployees(){
		System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
		if(listSvc.getAllEmployees().length == 0){
			System.out.println("没有员工记录");
		}else{
			for(int i = 0; i < listSvc.getAllEmployees().length; i++){
				System.out.println(listSvc.getAllEmployees()[i].toString());
			}
		}
	}
	
	private void listTeam(){
		System.out.println("\n--------------------团队成员列表---------------------\n");
		if(teamSvc.getTeam().length < 1){
			System.out.println("开发团队目前没有成员！");
		}else{
			System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
			for(int i = 0; i < teamSvc.getTeam().length; i++){
				System.out.println(teamSvc.getTeam()[i].toTeamString());
			}
			System.out.println("-----------------------------------------------------");
		}
	}
	
	private void addMember(){
		System.out.println("---------------------添加成员---------------------");
		System.out.print("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		try {
			teamSvc.addMember(listSvc.getEmployee(id));
			System.out.println("添加成功");
		} catch (TeamException e) {
			System.out.println("添加失败，原因为：" + e.getMessage());
		}
		
		TSUtility.readReturn();
		
	}
	
	private void deleteMember(){
		if(teamSvc.getTeam().length < 1){
			System.out.println("开发团队目前没有成员！");
		}else{
			System.out.print("请输入要删除员工的TID：");
			int tid = TSUtility.readInt();
			System.out.print("确认是否删除(Y/N)：");
			char key = TSUtility.readConfirmSelection();
			if(key == 'Y'){
				try {
					teamSvc.removeMember(tid);
					System.out.println("删除成功");
				} catch (TeamException e) {
					System.out.println(e.getMessage());
				}
				
			}
			TSUtility.readReturn();
			
		}
	}
	
	public static void main(String[] args){
		TeamView test = new TeamView();
			
		test.enterMainMenu();
		
	}
	
	
}
