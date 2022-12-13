package com.witstan.java1;

import org.junit.Test;

/*
 * 异常的处理：抓抛模型
 * 
 * 过程一：“抛” ：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象。
 * 			      并将此对象抛出。
 * 			      一旦抛出对象后，其后的代码不再执行。
 * 
 * 
 * 过程二：“抓” ： 理解为异常的处理方式：① try-catch-finally  ②throws
 * 
 * 二、try-catch-finally的使用
 * 
 * try{
 * 		//可能出现异常的代码
 * 	
 * }catch(异常类型1 变量名1){
 * 		//处理异常的方式1
 * }catch(异常类型2 变量名2){
 * 		//处理异常的方式2
 * }catch(异常类型3 变量名3){
 * 		//处理异常的方式3
 * }
 * ...
 * finally{
 * 		//一定会执行的代码
 * }
 * 
 * 说明：
 * 1.finally是可选的。
 * 2.使用try将可能出现的异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，
 * 根据此对象的异常类型，去cathc中进行匹配
 * 3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理，一旦处理完成，就跳出
 * 当前的try-catch结构（在没有写finally的情况下）。继续执行后面的代码
 * 4.catch中的异常类型如果没有子父类关系，则谁声明在前，谁声明在后没有关系，反之如果有子父类关系，则
 * 只能将子类声明在前，父类声明在后
 * 5.常用的异常对象处理方式：① String getMessage  ② printStackTrace()
 * 6.在try结构中声明的变量，在出了try结构后，就不能再被调用
 * 
 * 体会：使用try-catch-finally处理编译时异常，使得程序再编译时就不再报错，但是运行时仍可能报错。
 * 		相当于使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现。
 * 
 */
public class ExceptionTest1 {
	
	@Test
	public void test4() {
		
		String str = "123";
		str = "123ab";
		int num = 0;
		try{
			num = Integer.parseInt(str);
			System.out.println("hello1");
		}catch(ClassCastException e){
			System.out.println("出现类型转换异常");
		}catch(NumberFormatException e){
			//String getMessage();
//			System.out.println("出现数值转换异常");
//			System.out.println(e.getMessage());
			//printStackTrace();
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("出现异常");
		}
		
		System.out.println(num);
		
		System.out.println("hello2");
	}
}
