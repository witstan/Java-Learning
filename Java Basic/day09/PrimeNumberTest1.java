/*
100�����������
������������ֻ�ܱ�1����������������Ȼ��

��С��������2
��PrimeNumberTest.java���Ż�
*/

class PrimeNumberTest1 {
	public static void main(String[] args) {
		
		//day07�Լ�д��
		boolean b1 = true;
		int count = 0;//��¼��������

		//��ȡ��ǰʱ�����1970-01-01 00:00:00�ĺ�����
		long start = System.currentTimeMillis();

		for (int pn = 2; pn <= 100000; pn++){
			
			//�Ż������Ա�������������Ȼ������Ч�ġ�
			for (int i = 2; i <= Math.sqrt(pn); i++){
			//for (int i = 2; i < pn; i++){
				
				if (pn % i == 0){
					b1 = false;
					break;//�Ż�һ��ֻ�Ա��������������Ч
				}
			}
			
			if (b1 == true){
				//System.out.println(pn);
				count++;
			}
			
			b1 = true;

		}

		//��ȡ��ǰʱ�����1970-01-01 00:00:00�ĺ�����
		long end = System.currentTimeMillis();
		
		System.out.println("�����ĸ���Ϊ��" + count);
		System.out.println("�����ѵ�ʱ��Ϊ��" + (end - start));// 13939 - �Ż�һ��break 1221 - �Ż�����Math.sqrt() 11
	}
}
