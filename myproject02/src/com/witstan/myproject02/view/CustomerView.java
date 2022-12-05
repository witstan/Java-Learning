package com.witstan.myproject02.view;

import com.witstan.myproject02.bean.Customer;
import com.witstan.myproject02.service.CustomerList;
import com.witstan.myproject02.util.CMUtility;

/**
 * 
 * @Description CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author witstan
 * @version
 * @date 2022年12月4日下午4:55:19
 *
 */
public class CustomerView {

	CustomerList customerList = new CustomerList(10);

	public static void main(String[] args) {

		CustomerView viewtest = new CustomerView();
		viewtest.enterMainMenu();
	}



	/**
	 * 
	 * @Description 显示《客户信息管理软件》界面
	 * @author witstan
	 * @date 2022年12月5日上午11:33:23
	 */
	public void enterMainMenu() {

		boolean condition = true;
		while (condition) {

			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println();
			System.out.println("\t\t  1 添 加 客 户");
			System.out.println("\t\t  2 修 改 客 户");
			System.out.println("\t\t  3 删 除 客 户");
			System.out.println("\t\t  4 客 户 列 表");
			System.out.println("\t\t  5 退           出");
			System.out.println();
			System.out.println("\t\t      请选择(1-5): ");

			switch (CMUtility.readMenuSelection()) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("是否确定退出？(Y/N): ");
				char result = CMUtility.readConfirmSelection();
				if (result == 'Y') {
					condition = false;
				}
			}

		}

	}

	/**
	 * 
	 * @Description 添加客户
	 * @author witstan
	 * @date 2022年12月5日上午11:33:23
	 */
	private void addNewCustomer() {
		System.out.println("-----------------添加客户-----------------");

		// 获取新客户姓名
		System.out.print("姓名：");
		String name = CMUtility.readString(20);
		Customer c = new Customer(name);
		boolean add = customerList.addCustomer(c);

		if (add == false) {
			System.out.println("客户储存已满，添加失败！");
			return;
		}

		// 获取新客户性别
		System.out.print("性别：");
		char sex = CMUtility.readChar();
		c.setGender(sex);

		// 获取新客户年龄
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		c.setAge(age);

		// 获取新客户电话
		System.out.print("电话：");
		String phone = CMUtility.readString(20);
		c.setPhone(phone);

		// 获取新客户邮箱
		System.out.print("邮箱：");
		String email = CMUtility.readString(100);
		c.setEmail(email);

		System.out.println("-----------------添加完成-----------------");

	}

	/**
	 * 
	 * @Description 修改客户
	 * @author witstan
	 * @date 2022年12月5日上午11:33:23
	 */
	private void modifyCustomer() {
		System.out.println("-----------------修改客户-----------------");
		
		while(true){
			
			System.out.println("请选择待修改客户编号(-1退出)：");
			int index = CMUtility.readInt();
			
			//判断输入的索引是否有效
			if (index == -1) {
				return;
			}else if(index > customerList.getTotal() || index < 1){
				System.out.println("索引无效！");
			}else{
				Customer c = customerList.getCustomer(index - 1);

				// 修改客户姓名
				System.out.print("姓名（" + c.getName() + "）:");
				String newname = CMUtility.readString(20, c.getName());
				c.setName(newname);
			

				// 修改客户性别
				System.out.print("性别（" + c.getGender() + "）:");
				char newsex = CMUtility.readChar(c.getGender());
				c.setGender(newsex);


				// 修改客户年龄
				System.out.print("年龄（" + c.getAge() + "）:");
				int newage = CMUtility.readInt(c.getAge());
				c.setAge(newage);

				
				// 修改客户电话
				System.out.print("电话（" + c.getPhone() + "）:");
				String newphone = CMUtility.readString(20, c.getPhone());
				c.setPhone(newphone);

				
				// 修改客户邮箱
				System.out.print("邮箱（" + c.getEmail() + "）:");
				String newemail = CMUtility.readString(100, c.getEmail());
				c.setEmail(newemail);
				
				System.out.println("-----------------修改完成-----------------");
				return;
				
				//方法二，调用CustomerList的replaceCustomer方法
				/*
				Customer c = new Customer(newname,newsex,newage,newphone,newemail);	
				 
				System.out.print("姓名（" + c.getName() + "）:");
				String newname = CMUtility.readString(20, c.getName());
				
				System.out.print("性别（" + c.getGender() + "）:");
				char newsex = CMUtility.readChar(c.getGender());
				
				System.out.print("年龄（" + c.getAge() + "）:");
				int newage = CMUtility.readInt(c.getAge());
				
				System.out.print("电话（" + c.getPhone() + "）:");
				String newphone = CMUtility.readString(20, c.getPhone());
				
				System.out.print("邮箱（" + c.getEmail() + "）:");
				String newemail = CMUtility.readString(100, c.getEmail());
				
				customerList.replaceCustomer(index - 1, c);			 			  
				*/
			}
			
		}

	}

	/**
	 * 
	 * @Description 删除客户
	 * @author witstan
	 * @date 2022年12月5日上午11:33:23
	 */
	private void deleteCustomer() {
		System.out.println("-----------------删除客户-----------------");
		
		while(true){
			
			System.out.println("请选择待修改客户编号(-1退出)：");
			int index = CMUtility.readInt();
			
			//判断输入的编号号是否有效
			if (index == -1) {
				return;
			}else if(index > customerList.getTotal() || index < 1){
				System.out.println("索引无效！");
			}else{
				System.out.print("是否确定删除？(Y/N): ");
				char result = CMUtility.readConfirmSelection();
				if (result == 'Y') {
					customerList.deleteCustomer(index - 1);
					System.out.println("-----------------删除完成-----------------");
					return;
				}
			}
			
			
			
		}		
			
	}

	/**
	 * 
	 * @Description 展示客户列表
	 * @author witstan
	 * @date 2022年12月5日上午11:33:23
	 */
	private void listAllCustomers() {

		System.out.println("-----------------客户列表-----------------");

		if (customerList.getTotal() == 0) {
			System.out.println("没有客户记录！");
		} else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			for (int i = 0; i < customerList.getAllCustomers().length; i++) {

				int id = i + 1;
				String name = customerList.getCustomer(i).getName();
				char sex = customerList.getCustomer(i).getGender();
				int age = customerList.getCustomer(i).getAge();
				String phone = customerList.getCustomer(i).getPhone();
				String email = customerList.getCustomer(i).getEmail();

				String info = id + "\t" + name + "\t" + sex + "\t" + age + "\t" + phone + "\t" + email;
				System.out.println(info);
			}
		}

		System.out.println("----------------客户列表完成---------------");

	}

}
