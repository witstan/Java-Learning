/*
一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3。
编程 找出1000以内的所有完数。（因子：除去这个数本身的其它约数）


*/

class homework {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 1000; i++){
			for (int j = 1; j <= i / 2; j++){
				if (i % j == 0){
					sum += j;
				}	
			}
			if (sum == i){
				System.out.print(i + ",");
			}
			sum = 0;
		}
	}
}
