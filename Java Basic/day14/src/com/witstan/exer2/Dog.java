package com.witstan.exer2;

public class Dog {
	
	private String name;
	private int age;
	private boolean alert;
	
	
	public Dog(){
		
	}
	
	public Dog(String name){
		this.name = name;
	}
	
	public Dog(int age){
		this.age = age;
	}
	
	public Dog(String name, int age){
		this(name);
		this.age = age;
		
	}
	
	public void setName(String i){
		this.name = i;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAge(int i){
		this.age = i;
	}
	
	public int getAge(){
		return this.age;
	}
	
	
	public boolean isAlert() {
		return alert;
	}

	public void setAlert(boolean alert) {
		this.alert = alert;
	}

	public void fight(Cat cat){
		if(this.alert){
			System.out.println(this.name + ", the dog" +  " fights " + cat.getName() + ", the cat.");		
		}
	}
	
	public void shout(Cat cat){
		if(cat.isRage()){
			System.out.println("'Bark!'");
			this.alert = true;
		}else{
			System.out.println("The dog " + this.getName() + " is wandering.");
		}
	}
}
