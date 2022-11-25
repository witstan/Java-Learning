/*
变量的使用
1. java定义变量的格式：数据类型 变量名 = 变量值;

2.变量必须先声明，再使用

3.变量都定义在其作用域内，在作用域内有效。

4.同一个作用域内不可声明两个同名变量。

*/
class VariableTest {
	public static void main(String[] args) {
		//变量的定义
		int myAge = 114;
		//变量的使用
		System.out.println(myAge);
		

		//变量的声明
		int myNumber;
		//变量的赋值
		myNumber = 514;

		System.out.println(myNumber);

		//下方输出不可使用因为作用域不同
		//System.out.println(myClass);
	}

    public void method(){
		int myClass = 1;
	}
}
