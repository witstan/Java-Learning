package com.witstan.homework;

public class CustomerList{
	//声明Customer类型数组customers和记录存储的客户的个数的变量
	Customer[] customers;
	int total;
	
	//构造器，用来初始化customers数组
	public CustomerList(){
		customers = new Customer[10]; 
	}
	
	/**
	 * 添加指定的客户到数组中
	 * @return 添加是否成功
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length){
			return false;
		}
		customers[total++] = customer;
		return true;
	}
	
	/**
	 * 替换指定索引位置上的数组元素
	 * @return 是否替换成功
	 */
	public boolean replaceCustomer(int index, Customer cust){
		if(index < 0 || index >= total){
			return false;
		}
		customers[index - 1] = cust;
		return true;
	}
	
	/**
	 * 删除指定索引位置上的元素
	 * @return 是否删除成功
	 */
	public boolean deleteCustomer(int index){
		if(index < 0 || index >= total){
			return false;
		}
		for(int i = index - 1; i < total; i++){
			customers[i] = customers[i + 1];
		}
		customers[--total] = null;
		return true;
	}
	
	/**
	 * 获取所有的customers对象构成的数组
	 */
	public Customer[] getAllCustomers() {
		return customers;
	}
	
	/**
	 * 返回指定索引位置上的Customer
	 * @return 如果输入的index位置上的元素不存在，返回null
	 */
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total){
			return null;//可以报错
		}
		if(customers[index - 1] == null){
			return null;
		}
		return customers[index - 1];
	}
	
	/**
	 * 返回Customer对象的个数
	 */
	public int getTotal(){
		return total;
	}






}
