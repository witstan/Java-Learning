package com.witstan.java1;

public class StudentTest {

	public static void main(String[] args) {
		try {
			Student s = new Student();
			s.regist(-1001);
			System.out.println(s);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

class Student{
	private int id;
	
	public void regist(int id) throws Exception{
		if(id > 0){
			this.id = id;
		}else{
//			System.out.println("输入数据非法");
			//手动抛出异常对象
//			throw new RuntimeException("输入数据非法");
//			throw new Exception("输入数据非法");
			throw new MyException("不能输入负数");
			//错误的
//			throw new String("不能输入负数");
		}
	}
}
