/*
break��continue�ؼ��ֵ�ʹ��
				ʹ�÷�Χ			ѭ����ʹ�õ�����		��ͬ��

break��			switch-case			������ǰѭ��			�ؼ��ֺ��治������ִ�����
				ѭ���ṹ

continue:		ѭ���ṹ			��������ѭ��			�ؼ��ֺ��治������ִ�����

*/


class  BreakContinueTest{
	public static void main(String[] args) {

		for (int i = 4; i <=10; i++){

			if (i % 4 == 0){
				//break;//123
				continue;//1235678910
				//System.out.println("peach");
			}
			System.out.print(i);
		}
		System.out.println();
		//**********************************

		lable:for (int i = 1; i <= 4; i++){
			
			for (int j =1; j <= 10; j++){

				if (j % 4 == 0) {
					//break;//Ĭ�����������˹ؼ��������һ��ѭ����
					//continue;

					//break lable;//�����ƶ���ʶ��һ��ѭ���ṹ
					continue lable;//�����ƶ���ʶ��һ��ѭ���ṹ����ѭ��
				}
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
