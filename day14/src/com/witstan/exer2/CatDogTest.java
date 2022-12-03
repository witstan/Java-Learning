package com.witstan.exer2;

public class CatDogTest {
	public static void main(String[] args) {
		
		Cat c1 = new Cat("Tom", 2);
		Dog d1 = new Dog("Max", 1);
		
		//Dog d1 = new Dog();
		//d1.setName("Max");
		
		c1.setRage(false);
		//c1.setRage(true);
		d1.shout(c1);
		c1.fight(d1);
		d1.fight(c1);

		Cat c2 = new Cat("David");
		c2.setAge(5);
		int i = c1.compare(c2);
		if(i > 0){
			System.out.println(c1.getName() + " is older.");
		}else if(i == 0){
			System.out.println(c1.getName() + " is as old as " + c2.getName());
		}else{
			System.out.println(c2.getName() + " is older.");
		}
		
		String s = c1.compare2(c2);
		System.out.println(s);
	}
}
