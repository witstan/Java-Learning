/*
Java�������������

1.���������ͷ֣�

	�����������ͣ�
	�����ͣ�byte\short\int\long
	�����ͣ�float\double
	�ַ��ͣ�char
	�����ͣ�boolean

	������������:
	�� class
	�ӿ� interface
	���� array

2.������������λ�ã�
	
	��Ա����
	�ֲ�����

*/

class VariableTest1 {
	public static void main(String[] args) {
		//�����ͣ�byte(1�ֽ� = 8 bit��\short��2�ֽڣ�\int��4�ֽڣ�\long��8�ֽڣ�
		//��byte��Χ��-128-127
		byte b1 = 12;
		//byte b2 = -128
		//b2 = 128,���벻ͨ��
		//������long�ͱ����������ԡ�l����L����β
		//ͨ�������������ͱ���ʱ��ʹ��int�͡�
		short s1 = 128;
		int i1 = 1234;
		long l1 = 3427374L;
		System.out.println(l1);	

		//�����ͣ�float(4�ֽڣ�\double��8�ֽڣ�
		//�����ͱ�ʾ��С������ֵ

		double d1 = 123.4;
		System.out.println(d1);
		//����floatʱ��Ҫ��ĩβ�ԡ�f����F����β
		float f1 = 12.3F;
		System.out.println(f1);
		//ͨ�����帡���ͱ���ʹ��double��

		//�ַ��ͣ�char��1�ַ� = 2�ֽڣ�
		char c1 = 'a';
		//char c2 = 'ab';���벻ͨ��
		//charֻ������һ���ַ�
		System.out.println(c1);

		char c3 = '@';
		char c4 = '��';
		char c5 = '��';
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		//��ʾ��ʽ��1.����һ���ַ���2.ת���ַ�
		char c6 = '\n';//���з�
		c6 = '\t';//�Ʊ���
		
		System.out.print("hello" + c6);
		System.out.println("world");

		char c7 = '\u0123';
		System.out.println(c7);
		
		//����ʹ��unicode�ַ����뼯
		char c8 = '\u0043';
		System.out.println(c8);

		char c9 = 97;
		//���'a'���������зǳ��ټ�

		//�����ͣ�boolean
		//��ֻ��ȡ����ֵ��true\false
		//���������жϡ�ѭ���ṹ��ʹ��
		boolean bb1 = true;
		System.out.println(bb1);

		boolean isgay = true;
		if(isgay){
			System.out.println("congrates");
			//��Ҫ�ڡ�����ʹ��˫���ţ�����Ҫʹ�õ�˫����ǰ��\����������
			System.out.println("����һ��\"����\"");
		}else{
			System.out.println("okay");
		}



	}
}