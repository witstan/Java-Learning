/*
Ƕ��ѭ����ʹ��
1.Ƕ��ѭ������һ��ѭ���ṹA��������һ��ѭ���ṹB��ѭ�����У��͹�����Ƕ��ѭ��

2.
���ѭ����ѭ���ṹB
�ڲ�ѭ����ѭ���ṹA

3.˵��
���ڲ�ѭ���ṹ����һ�飬ֻ�൱�����ѭ��ѭ����ִֻ����һ��
�ڼ������ѭ����Ҫִ��m�ʣ��ڲ�ѭ����Ҫִ��n�ʡ���ʱ�ڲ�ѭ��ѭ����ִ���˶��ٴΣ�

4.���ѭ�������������ڴ�ѭ����������
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
		for (int i = 1; i<= 5; i++){//��������
			for (int j = 1; j <= i; j++){//��������
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
		//��


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
			// �����-��
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			// �����* ��

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
