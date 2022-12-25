package com.witstan.java;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * try-catch-finally中finally的使用：
 * 
 * 1.finally是可选的
 * 2.finally中声明的是一定会被执行的代码，即使catch中又出现了异常，try中有return语句，
 * catch中有return语句等情况。
 * 3.例如数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，需要自己手动
 * 进行资源释放操作。此时的资源释放，就需要声明再finally中。
 * 
 */
import org.junit.Test;

public class FinallyTest {

	
	@Test
	public void test2(){
		
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			
			int data = fis.read();
			while(data != -1){
				System.out.print((char)data);
				data = fis.read();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fis != null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	@Test
	public void testMethod(){
		int num = method();
		System.out.println(num);
	}
	
	
	public int method(){
		try{
			int[] arr = new int[10];
			System.out.println(arr[10]);
			return 1;
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return 2;
		}finally{
			System.out.println("一定会被执行");
			return 3;
		}
		
	}
	
	
	
	@Test
	public void test(){
		try{
			int a = 10, b = 0;
			System.out.println(a / b);
		}catch(ArithmeticException e){
			e.printStackTrace();
			
			int[] arr = new int[10];
			System.out.println(arr[10]);
		}catch(Exception e){
			e.printStackTrace();
		}
//		System.out.println("**");
		
		finally{
			System.out.println("caught it");
		}
	}
}
