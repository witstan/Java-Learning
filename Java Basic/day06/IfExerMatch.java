/*

��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů������ȻҪ��� 
һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
 >�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
 >�������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
 >������������������㣬�򣺡����ޣ���

��ʾ��
Sysout(������:   (cm)) 
scanner.nextInt(); 
Sysout(���Ƹ�:   (ǧ��)) 
scanner.nextDouble();
Sysout(��˧��:   (true/false))   (��/��)
scanner.nextBoolean();  scanner.next();   ���ǡ�.equals(str)  

*/

import java.util.Scanner;

class IfExerMatch{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("������������ߣ���cm��");
		int height = scan.nextInt();

		System.out.println("��������ĲƸ�����ǧ��");
		double wealth = scan.nextDouble();	

		/*
		��ʽһ��
		System.out.println("���������Ƿ�ÿ�����true/false��");
		boolean looking = scan.nextBoolean();

		if (height >= 180 && wealth >= 1 && looking){
			System.out.println("����");
		}else if(height >= 180 || wealth >= 1 || looking){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
		*/

		//��ʽ����
		System.out.println("���������Ƿ�ÿ�������/��");
		String looking = scan.next();

		if (height >= 180 && wealth >= 1 && looking.equals("��")){
			System.out.println("����");
		}else if(height >= 180 || wealth >= 1 || looking.equals("��")){
			System.out.println("����");
		}else{
			System.out.println("����");
		}

	}
}