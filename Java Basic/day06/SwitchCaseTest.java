/*
分支结构之二：switch-case

1.格式
switch(表达式){
case 常量1:
	执行语句1;
	//break;
case 常量2:
	执行语句2;
	//break;

...

default:
	执行语句n;
	//break;
}

2. 说明：
①根据switch表达式中的值，依次匹配各个case中的常量。
一旦匹配成功，则进入相应case结构中，调用其执行语句。
当调用完执行语句后，仍然继续向下执行其他case结构中的
执行语句，知道遇到break关键字或此switch-case结构末尾结束为止。

②break，可以使用在switch-case结构中，表示一旦执行到此跳出switch-case结构

③swtich结构中的表达式，只能是如下6种数据类型之一：byte/short/char/int/枚举类型（JDK5.0新增）/String类型（JDK7.0新增）

④case之后只能声明常量，不能声明范围！

⑤break关键字在switch-case结构中是可选的。

⑥default：相当于if-else结构中的else。
		  default结构是可选的，而且位置是灵活的。
*/

class SwitchCaseTest {
	public static void main(String[] args) {

		int number = 2;
		switch(number){
		
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("other");
		}
		
		String season = "summer"; 
		switch (season) {
		case "spring":
			System.out.println("春暖花开"); 
			break;
		case "summer":
			System.out.println("夏日炎炎"); 
			break;
		case "autumn":
			System.out.println("秋高气爽"); 
			break;
		case "winter":
			System.out.println("冬雪皑皑"); 
			break;
		default:
			System.out.println("季节输入有误"); 
			break;
		}
	}
}
