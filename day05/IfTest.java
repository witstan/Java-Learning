/*
��֧�ṹ�ֵ�if-else�������жϽṹ��


һ��3�ֽṹ

��һ�֣�
if(�������ʽ){
	ִ�б��ʽ
}

�ڶ��֣���ѡ1
if(�������ʽ1){
	ִ�б��ʽ1
}else{
	ִ�б��ʽ2
}

�����֣�nѡ1
if(�������ʽ1){
	ִ�б��ʽ1
}else if(�������ʽ2){
	ִ�б��ʽ2
}else if(�������ʽ3){
	ִ�б��ʽ3
}
����
else{
	ִ�б��ʽn
}

*/

class IfTest {
	public static void main(String[] args) {
		
		//����1
		int heartBeats = 78;
		if (heartBeats < 60 || heartBeats > 100){
			System.out.println("��Ҫ����һ�����");
		}
		System.out.println("������");

		//����2
		int age = 65;
		if (age < 18){
			System.out.println("���߱���ȫ��Ϊ����");
		}else{
			System.out.println("�߱���ȫ��Ϊ����");
		}

		//����3
		if (age < 0){
			System.out.println("����������ݷǷ�");
		}else if(age < 18){
			System.out.println("������");
		}else if(age < 35){
			System.out.println("��׳��");
		}else if(age < 60){
			System.out.println("����");
		}else if(age < 120){
			System.out.println("����");
		}else{
			System.out.println("����");
		}

	}
}
