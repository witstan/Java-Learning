/*
һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"������6=1��2��3��
��� �ҳ�1000���ڵ����������������ӣ���ȥ��������������Լ����


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
