package com.witstan.java;
/*
 * 接口的使用
 * 1.接口使用上也满足多态性
 * 2.接口，实际上就是定义了一种规范
 * 3.开发中，体会面向接口编程
 * 
 */
public class USBTest {
	public static void main(String[] args) {
		
		Computer c = new Computer();
		//1.创建了接口的非匿名实现类的非匿名对象
		Flash f = new Flash();
		c.transferDate(f);
		Printer p = new Printer();
		c.transferDate(p);
		
		//2.创建了接口的非匿名实现类的匿名对象
		c.transferDate(new Printer());
		
		//3.创建了接口的匿名实现类的非匿名对象
		USB phone = new USB(){

			@Override
			public void start() {
				System.out.println("手机开始工作");
				
			}

			@Override
			public void stop() {
				System.out.println("手机结束工作");
				
			}
			
		};
		
		c.transferDate(phone);
		
		
		//3.创建了接口的匿名实现类的匿名对象
		c.transferDate(new USB(){

			@Override
			public void start() {
				System.out.println("mp3开始工作");
				
			}
 
			@Override
			public void stop() {
				System.out.println("mp3结束工作");
				
			}
			
		});
		
		
	}
}

class Computer{
	
	public void transferDate(USB usb){
		usb.start();
		System.out.println("process");
		usb.stop();
	}
}

interface USB{
	
	//常量：定义了长宽高、最大最小的传输速度；
	void start();
	
	void stop();
}

class Flash implements USB{
	
	@Override
	public void start() {
		System.out.println("U盘开启工作");
		
	}
	
	@Override
	public void stop() {
		System.out.println("U盘结束工作");
		
	}
}

class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印机开启工作");
		
	}

	@Override
	public void stop() {
		System.out.println("打印机结束工作");
		
	}
	
}
