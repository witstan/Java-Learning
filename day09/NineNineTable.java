/*
�žų˷���
1 * 1 = 1
2 * 1 = 2 2 * 2 = 4
...
9 * 1 = 9 ... 9 * 9 = 81
*/

class NineNineTable {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++){
			System.out.print(i + "    ");
		}
		System.out.println();
		for (int j = 1; j < 10; j++){
			System.out.print(j + "    ");
			for (int k = 1 ; k < 10; k++){
				System.out.print(k*j + "    ");
			}
			System.out.println();
		}
		//������д��������γ̣�Ҫ��ʽ��̬

		for (int num1 = 1; num1 < 10; num1++){
			for (int num2 = 1; num2 <= num1; num2++){
				System.out.print(num1 + " * " + num2 + " = " + (num1 * num2) + " ");
			}
			System.out.println();
		}
		//5���Ӹ㶨	
	}
}