/*
�����֮�����Ƚ������
== != > < >= <= instanceof

����
1. �Ƚ����������������boolean����
2. ���� == �� =

*/

class CompareTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;

		System.out.println(i == j);//false
		System.out.println(i = j);//20

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 == b2);//false
		System.out.println(b1 = b2);
		//false���������falseΪb2��ֵ����b1�������ǱȽ����㣬ע��

	}
}
