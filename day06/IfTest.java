/*
��С���μ�Java���ԣ����͸�������Ⱥ��ɳ�ŵ�� 
�����
�ɼ�Ϊ100��ʱ������һ��BMW��
�ɼ�Ϊ(80��99]ʱ������һ̨iphone xs max�� 
���ɼ�Ϊ[60,80]ʱ������һ��  iPad�� 
����ʱ��ʲô����Ҳû�С�
��Ӽ���������С������ĩ�ɼ����������ж�

˵����
1. else�ṹʱ��ѡ�ġ�
2.������������ʽ��
	> �������������ʽ֮���ǡ����⡰��ϵ����û�н�����ϵ����
	  ��ô��д���ʽ˳��Ӱ��
	> �������������ʽ֮���н�����ϵ��
	  ��Ҫ����ʵ������������Ӧ�ý��ĸ��ṹ����������
	> ���������ʽ�а����뱻�����Ĺ�ϵ��ͨ���������Ҫ��
	  ��ΧС��д��ǰ�棬����С�Ĳ����л���ִ��
*/

import java.util.Scanner;

class IfTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("������ɼ���");

		int score = scan.nextInt();

		if(score >= 60 && score <= 80){
			System.out.println("����һ��ipad");
		}else if(score > 80 && score <= 99){
			System.out.println("����һ̨iphone xs max");
		}else if(score == 100){
			System.out.println("����һ��BMW");
		}else if(score < 0 || score > 100){
			System.out.println("��������ȷ�ĳɼ�");
		}else{
			System.out.println("ʲô����Ҳû��");
		} 

	}
}
