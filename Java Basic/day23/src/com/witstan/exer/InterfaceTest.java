package com.witstan.exer;

public class InterfaceTest {
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle();
		c1.setRadius(3.5);
		ComparableCircle c2 = new ComparableCircle();
		c2.setRadius(3.55);
		try {
			int result = c1.compareTo(c2);
			System.out.println(result);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}
