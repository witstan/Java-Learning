/*
分支结构种的if-else（条件判断结构）


一、3种结构

第一种：
if(条件表达式){
	执行表达式
}

第二种：二选1
if(条件表达式1){
	执行表达式1
}else{
	执行表达式2
}

第三种：n选1
if(条件表达式1){
	执行表达式1
}else if(条件表达式2){
	执行表达式2
}else if(条件表达式3){
	执行表达式3
}
……
else{
	执行表达式n
}

*/

class IfTest {
	public static void main(String[] args) {
		
		//举例1
		int heartBeats = 78;
		if (heartBeats < 60 || heartBeats > 100){
			System.out.println("需要做进一步检查");
		}
		System.out.println("检查结束");

		//举例2
		int age = 65;
		if (age < 18){
			System.out.println("不具备完全行为能力");
		}else{
			System.out.println("具备完全行为能力");
		}

		//举例3
		if (age < 0){
			System.out.println("你输入的数据非法");
		}else if(age < 18){
			System.out.println("青少年");
		}else if(age < 35){
			System.out.println("青壮年");
		}else if(age < 60){
			System.out.println("中年");
		}else if(age < 120){
			System.out.println("老年");
		}else{
			System.out.println("仙人");
		}

	}
}
