/*
������������֮����������

ǰ�᣺ֻ����7�л����������ͱ���������㣬������boolean�͡�

1.�Զ�����������
	byte��short��char > int > long > float > double
	�漰��������ͬ���������ͱ�����һ�����㣬��������Ϊ��������������͡����˴�������Сָ�������͵ķ�Χ��������ʵ�ʴ�С��
	
	!��byte��short��char�������ͱ��������㣬���Ϊint����

2.ǿ������ת����
	��VariableTest3.java

*/

class VariableTest2{
	public static void main(String[] args) {
		
		byte b1 = 1;
		int i1 = 128;
		/*�����������byte�������ͱ��벻ͨ������Ϊintռ���ֽڸ��࣬
		��ռ���ֽڸ��ٵ�byte���ܶ�ʧ����*/
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		System.out.println(i2);

		float f = b1 + +i1;
		System.out.println(f);
	}
}
