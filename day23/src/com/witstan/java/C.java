package com.witstan.java;

interface A { 
	int x = 0;
}
class B { 
	int x = 1;
}
class C extends B implements A { 
	public void pX() {
		//编译不通过。x不明确
		//System.out.println(x); 
		System.out.println(super.x); 
		System.out.println(A.x); 
}
	public static void main(String[] args) { 
		new C().pX();
	} 
}