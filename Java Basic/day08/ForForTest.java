/*
嵌套循环的使用
1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环

2.
外层循环：循环结构B
内层循环：循环结构A

3.说明
①内层循环结构遍历一遍，只相当于外层循环循环体只执行了一次
②假设外层循环需要执行m词，内层循环需要执行n词。此时内层循环循环体执行了多少次？

4.外层循环控制行数，内存循环控制列数
*/
class ForForTest{
	public static void main(String[] args){

		//******
		//System.out.println("******");
		for (int i = 1; i <= 6; i++){
			System.out.print('*');
		}
		System.out.println();
		/*
		******
		******
		******
		******
		*/
		for (int j = 1; j<= 4; j++){
			for (int i = 1; i <= 6; i++){
				System.out.print('*');
				}
			System.out.println();
		}

		/*
		*
		**
		***
		*****
		*/
		for (int i = 1; i<= 5; i++){//控制行数
			for (int j = 1; j <= i; j++){//控制列数
				System.out.print('*');
				}
			System.out.println();
		}

		/*
		****
		***
		**
		*
		*/
		for (int i = 1; i<= 4; i++){
			for (int j = (5 - i); j > 0 ; j--){
			//for (int j = 1; j <= (5 - i) ; j++){
				System.out.print('*');
				}
			System.out.println();
		}

		/*

		*
		**
		***
		****
		*****
		****
		***
		**
		*
		*/
		//略


		/*
			* 
		   * * 
		  * * * 
         * * * * 
        * * * * * 
         * * * * 
          * * * 
           * * 
            * 
		*/


		for (int i = 0; i < 5; i++) {
			// 输出“-”
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			// 输出“* ”

			for (int k = 0; k < i + 1; k++) {
				System.out.print("* ");
				}
			System.out.println();
			}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 4 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();

}





	}
}
