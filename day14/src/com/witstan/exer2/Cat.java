package com.witstan.exer2;

public class Cat {

	private String name;
	private int age;
	private boolean rage;
	
	public Cat(){
		
	}
	
	public Cat(String name){
		this.name = name;
	}
	
	public Cat(int age){
		this.age = age;
	}
	
	public Cat(String name, int age){
		this(name);
		this.age = age;
	}
	
	public void setName(String i){
		this.name = i;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	public boolean isRage() {
		return rage;
	}

	public void setRage(boolean rage) {
		this.rage = rage;
	}

	public void fight(Dog dog){
		if(dog.isAlert()){
			System.out.println("The cat, " + this.getName() + " is fighting" + " the dog, " + dog.getName() + ".");
		}
	}
	
	
	
	/**
	 * 
	* @Description 比较两个对象的大小
	* @author witstan
	* @date 2022年12月3日上午11:15:10 
	* @param cat
	* @return 正数，当前对象的属性在比较中更大；负数，当前对象的
	* 属性在比较中更小；0，当前对象与形参对象的该属性相等
	 */
	public int compare(Cat cat){
//		if(this.age > cat.age){
//			return 1;
//		}else if(this.age > cat.age){
//			return -1;
//		}else{
//			return 0;
//		}
		
		return this.age - cat.age;
	}
	
	public String compare2(Cat cat){
		if(this.age - cat.age > 0){
			return this.getName() + " is older.";
		}else if(this.age - cat.age == 0){
			return this.getName() + " is as old as " + cat.getName();
		}else{
			return cat.getName() + " is older.";
		}
	}

	public void setAge(int i){
		this.age = i;
	}
}
