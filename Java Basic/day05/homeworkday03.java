class homeworkday03 {
	public static void main(String[] args) {


		/*
		��ҵ1��
		3.	��������int�ͱ�������ֵ��ʹ����Ԫ���������if-else��ȡ���������еĽϴ�����ʵ��

		*/
		int i1 = 35, i2 = -9, i3 = -27;
		int max; 
		if(i1 > i2){
			//int max = i1; �ڴ������������ı���ֻ�ڴ������������ã��������ﲻ��������
			max = i1;
		}else{
			//int max = i2; ͬ��
			max = i2;
		}
		//System.out.println(i2);
		//System.out.println(max);
		if(max > i3){
			System.out.println("�����������Ϊ��" + max);
		}else{
			System.out.println("�����������Ϊ��" + i3);
		}
		
		//ע�⣡�����ڴ������������ı���ֻ�ڴ������������ã�



		/*
		��ҵ2��
		4.	��д��������2��double�ͱ�������ֵ���жϵ�һ��������10.0��
		�ҵ�2����С��20.0����ӡ����֮�͡����򣬴�ӡ�����ĳ˻���
		*/

		double num1 = 9.0, num2 = 12.0;
		if (num1 > 10.0 && num2 < 20.0){
			System.out.println("����֮��Ϊ��" + (num1 + num2));
		}else{
			System.out.println("�����˻�Ϊ��" + (num1 * num2));
		}
		

		/*
		��ҵ3��
		5.	������������ֵ�Ĵ����ʵ��
		*/

		int ii1 = 14, ii2 = -54;
		ii1 = ii1 ^ ii2;
		ii2 = ii1 ^ ii2;
		ii1 = ii1 ^ ii2;
		//System.out.println("������ii1 = " + ii1 + "\n" + "������ii2 = " + ii2);
		System.out.println("������ii1 = " + ii1 + "��ii2 = " + ii2);

	}
}