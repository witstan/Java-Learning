/*
运算符之四：逻辑运算符
& && | || ! ^

说明：
1.逻辑运算符操作的都是boolean类型的变量

*/

class LogicTest{
	public static void main(String[] args) {

		//区分 & 与 &&
		//相同点：运算结果一样
		//相同点2：当符号左边为true时，二者都会执行符号右边运算
		//不同点：当符号左边为false时，&&不会执行符号右边运算
		//开发中，推荐使用&&
		boolean b1 = true;
		int num1 = 10;
		if(b1 & (num1++ >0)){
			System.out.println("aa" + num1);
		}else{
			System.out.println("bb" + num1);	
		}

		boolean b2 = true;
		int num2 = 10;
		if(b2 && (num2++ >0)){
			System.out.println("aa" + num2);
		}else{
			System.out.println("bb" + num2);	
		}

		boolean b3 = false;
		int num3 = 10;
		if(b3 & (num3++ >0)){
			System.out.println("aa" + num3);
		}else{
			System.out.println("bb" + num3);	
		}

		boolean b4 = false;
		int num4 = 10;
		if(b4 && (num4++ >0)){
			System.out.println("aa" + num4);
		}else{
			System.out.println("bb" + num4);	
		}


		//区分：| 与 ||
		//相同点：运算结果一样
		//相同点2：当符号左边为false时，二者都会执行符号右边运算
		//不同点：当符号左边为ture时，||不会执行符号右边运算
		//开发中，推荐使用||
		boolean bb1 = false;
		bb1 = true;
		//重新赋值为true输出结果
		int ii1 = 10;
		//if(bb1 | (ii1++ > 0)){
		if(bb1 | (ii1++ < 0)){
			System.out.println("cc");
		}else{
			System.out.println("dd");		
		}

		System.out.println("ii1 = " + ii1);

		boolean bb2 = false;
		bb2 = true;
		//重新赋值为true输出结果
		int ii2 = 10;
		//if(bb2 || (ii2++ > 0)){
		if(bb2 || (ii2++ < 0)){
			System.out.println("cc");
		}else{
			System.out.println("dd");		
		}

		System.out.println("ii2 = " + ii2);


		
	}
}
