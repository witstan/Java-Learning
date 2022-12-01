package com.witstan.java1;

public class ValueTransferTest2 {
	public static void main(String[] args) {
		
		Data data = new Data();
		data.m = 10;
		data.n = 20;
		
		System.out.println("data.m = " + data.m + ", data.n = " + data.n);
		ValueTransferTest2 test = new ValueTransferTest2();
		test.swap(data);
		
		System.out.println("data.m = " + data.m + ", data.n = " + data.n);
	}
	
	public void swap(Data data){
		int temp = data.n;
		data.n = data.m;
		data.m = temp;
	}
}

class Data{
	int m;
	int n;
}