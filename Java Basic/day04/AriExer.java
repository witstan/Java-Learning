/*

随意给出一个整数，打印显示它的个位数，十位数，百位数的值。 
格式如下：
数字xxx的情况如下： 
个位数：
十位数： 
百位数：
例如：
数字153的情况如下： 
个位数：3
十位数：5 
百位数：1

*/
class AriExer{
	public static void main(String[] args){
		
		int i = 514;
		int i100 = i / 100;
		int i10 = i % 100 / 10; //或 = i /10 % 10;
		int i1 = i % 10;

		System.out.println("百位 = " + i100);
		System.out.println("十位 = " + i10);
		System.out.println("个位 = " + i1);
	}
}
