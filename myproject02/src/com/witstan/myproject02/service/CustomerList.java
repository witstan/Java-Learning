package com.witstan.myproject02.service;

import com.witstan.myproject02.bean.Customer;

/**
 * 
 * @Description CustomerList为Customer对象的管理模块，
 * 内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，
 * 供CustomerView调用
 * @author witstan 
 * @version
 * @date 2022年12月4日下午4:53:26
 *
 */
public class CustomerList {
	private Customer[] customers;//用来保存客户对象的数组
	private int total;//记录已保存客户对象的数量
	
	public static void main(String[] args) {
		
		CustomerList listtest = new CustomerList(5);
		System.out.println();
		
		listtest.addCustomer(new Customer("王五"));//0
		listtest.addCustomer(new Customer("赵六"));//1
		listtest.addCustomer(new Customer("拜登"));//2
		listtest.addCustomer(new Customer("布林肯"));//3
		

		//测试将customers数组中角标为0的对象替换为新的name为川普的对象是否成功
		boolean b1 = listtest.replaceCustomer(0, new Customer("川普"));
		System.out.println(b1);
		
		
		//测试将customers数组中角标为1的对象删除是否成功
		boolean b2 = listtest.deleteCustomer(1);
		System.out.println(b2);
		
		System.out.println("******************************");
		//测试返回数组中记录的所有客户对象
		Customer[] customers1 = listtest.getAllCustomers();
		System.out.println(customers1[1].getName());

		
		System.out.println("******************************");
		//测试返回参数index指定索引位置的客户对象记录
		Customer c1 = listtest.getCustomer(0);
		System.out.println(c1.getName());
		
		//测试已保存客户对象的数量
		int i = listtest.getTotal();
		System.out.println(i);
	}
	
	/**
	 * 用来初始化customers数组
	 * @param totalCustomer 指定customers数组的最大空间
	 */
	public CustomerList(int totalCustomer){
		customers = new Customer[totalCustomer];
	}
	
	/**
	 * 
	* @Description  将参数customer添加到数组中最后一个客户对象记录之后
	* @author witstan
	* @date 2022年12月4日下午10:06:16 
	* @param customer customer指定要添加的客户对象
	* @return  添加成功返回true；false表示数组已满，无法添加
	 */
	public boolean addCustomer(Customer customer){
		if(customers.length == this.total){
			//System.out.println("无法添加");
			return false;
		}else{
			customers[total++] = customer;
			return true;
		}
	}
	
	/**
	 * 
	* @Description 用参数customer替换数组中由index指定的对象
	* @author witstan
	* @date 2022年12月4日下午10:06:51 
	* @param index 指定所替换对象在数组中的位置，从0开始
	* @param cust 指定替换的新客户对象
	* @return 替换成功返回true；false表示索引无效，无法替换
	 */
	public boolean replaceCustomer(int index, Customer cust){
//		if(index < 0 || index >= total){
//			//System.out.println("索引无效，无法替换");
//			return false;
//		}else{
			customers[index] = cust;
			return true;
//		}
		
	}
	
	/**
	 * 
	* @Description 从数组中删除参数index指定索引位置的客户对象记录
	* @author witstan
	* @date 2022年12月4日下午10:07:42 
	* @param index 指定所删除对象在数组中的索引位置，从0开始
	* @return 删除成功返回true；false表示索引无效，无法删除
	 */
	public boolean deleteCustomer(int index){
//		if(index < 0 || index >= total){
//			//System.out.println("索引无效，无法删除");
//			return false;
//		}else{
			for(int i = index;i < total - 1; i++){
				customers[i] = customers[i + 1];
			}
			customers[--total] = null;
			//customers[index] = null;
			//customers[index] = new Customer();
			return true;
		}
//	}
	
	/**
	 * 
	* @Description  返回数组中记录的所有客户对象
	* @author witstan
	* @date 2022年12月4日下午10:08:44 
	* @return 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
	 */
	public Customer[] getAllCustomers(){
		Customer[] allcustomers = new Customer[total];
		for(int i = 0; i < allcustomers.length; i++){
			allcustomers[i] = customers[i];
		}
		return allcustomers;
	}
	
	/**
	 * 
	* @Description  返回参数index指定索引位置的客户对象记录
	* @author witstan
	* @date 2022年12月4日下午10:09:02 
	* @param index 指定所要获取的客户在数组中的索引位置，从0开始
	* @return 封装了客户信息的Customer对象
	 */
	public Customer getCustomer(int index){
		if(index < 0 || index >= total){
			//System.out.println("索引无效");
			return null;
		}else{
			return customers[index];
		}
	}
	
	/**
	 * 
	* @Description 返回已保存客户对象的数量
	* @author witstan
	* @date 2022年12月4日下午10:10:12 
	* @return 返回已保存客户对象的数量
	 */
	public int getTotal(){
		return total;
	}



}
