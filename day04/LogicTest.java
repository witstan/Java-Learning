/*
�����֮�ģ��߼������
& && | || ! ^

˵����
1.�߼�����������Ķ���boolean���͵ı���

*/

class LogicTest{
	public static void main(String[] args) {

		//���� & �� &&
		//��ͬ�㣺������һ��
		//��ͬ��2�����������Ϊtrueʱ�����߶���ִ�з����ұ�����
		//��ͬ�㣺���������Ϊfalseʱ��&&����ִ�з����ұ�����
		//�����У��Ƽ�ʹ��&&
		boolean b1 = true;
		int num1 = 10;
		if(b1 & (num1++ >0)){
			System.out.println("aa" + num1);
		}else{
			System.out.println("bb" + num1);	
		}

		boolean b2 = true;
		int num2 = 10;
		if(b2 && (num2++ >0)){
			System.out.println("aa" + num2);
		}else{
			System.out.println("bb" + num2);	
		}

		boolean b3 = false;
		int num3 = 10;
		if(b3 & (num3++ >0)){
			System.out.println("aa" + num3);
		}else{
			System.out.println("bb" + num3);	
		}

		boolean b4 = false;
		int num4 = 10;
		if(b4 && (num4++ >0)){
			System.out.println("aa" + num4);
		}else{
			System.out.println("bb" + num4);	
		}


		//���֣�| �� ||
		//��ͬ�㣺������һ��
		//��ͬ��2�����������Ϊfalseʱ�����߶���ִ�з����ұ�����
		//��ͬ�㣺���������Ϊtureʱ��||����ִ�з����ұ�����
		//�����У��Ƽ�ʹ��||
		boolean bb1 = false;
		bb1 = true;
		//���¸�ֵΪtrue������
		int ii1 = 10;
		//if(bb1 | (ii1++ > 0)){
		if(bb1 | (ii1++ < 0)){
			System.out.println("cc");
		}else{
			System.out.println("dd");		
		}

		System.out.println("ii1 = " + ii1);

		boolean bb2 = false;
		bb2 = true;
		//���¸�ֵΪtrue������
		int ii2 = 10;
		//if(bb2 || (ii2++ > 0)){
		if(bb2 || (ii2++ < 0)){
			System.out.println("cc");
		}else{
			System.out.println("dd");		
		}

		System.out.println("ii2 = " + ii2);


		
	}
}