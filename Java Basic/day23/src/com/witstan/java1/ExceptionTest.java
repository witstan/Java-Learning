package com.witstan.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 * 一、异常体系结构
 * 
 * java.lang.Throwable
 * 		|-----java.lang.Error: 一般不编写代码处理
 * 		|-----java.lang.Exception:可以进行异常的处理
 * 			|-----编译时异常（checked）
 * 				|-----IOException
 * 					|-----FileNotFoundException
 * 				|-----ClassNotFoundException
 * 			|-----运行时异常（unchecked）
 * 				|-----NullPointerException
 * 				|-----ArrayIndextOutOfBoundException
 * 				|-----ClassCastException
 * 				|-----NumberFormatException
 * 				|-----InputMismatchException
 * 				|-----ArithmeticException
 * 
 * 面试题：常见的异常有哪些？举例说明
 * 
 */
public class ExceptionTest {

	
	//*********************以下编译时异常**********
	@Test
	public void test7(){
		try{
			File file = new File("hello.txt");
			FileInputStream fis = new FileInputStream(file);
			
			int data = fis.read();
			while(data != -1){
				System.out.print((char)data);
				data = fis.read();
			}
			
			fis.close();
		}catch(FileNotFoundException e){
			e.getStackTrace();
		}catch(IOException e){
			e.getStackTrace();
		}
	}
	
	//*********************以下运行时异常**********
	//ArithmeticException
	@Test
	public void test6(){
		int a = 5, b = 0;
		System.out.println(a / b);
	}
	
	//InputMismatchException
	@Test
	public void test5(){
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println(score);
	}
	
	//NumberFormatException
	@Test
	public void test4(){
		String str = "123";
		str = "123ab";
		int num = Integer.parseInt(str);
	}
	
	//ClassCastException
	@Test
	public void test3(){
		Object o = new Date();
		String str = (String)o;
	}
	
	
	//IndextOutOfBoundException
	@Test
	public void test2(){
		//ArrayIndextOutOfBoundException
//		int[] arr = new int[10];
//		System.out.println(arr[10]);
		//StringIndextOutOfBoundException
		String str = "abc";
		System.out.println(str.charAt(3));
	}
	
	
	
	
	//NullPointerException
	@Test
	public void test1(){
		int[] arr = null;
		System.out.println(arr[2]);
		
		String str = "abc";
		str = null;
		System.out.println(str.charAt(2));
	}
}
