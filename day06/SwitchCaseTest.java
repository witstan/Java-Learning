/*
��֧�ṹ֮����switch-case

1.��ʽ
switch(���ʽ){
case ����1:
	ִ�����1;
	//break;
case ����2:
	ִ�����2;
	//break;

...

default:
	ִ�����n;
	//break;
}

2. ˵����
�ٸ���switch���ʽ�е�ֵ������ƥ�����case�еĳ�����
һ��ƥ��ɹ����������Ӧcase�ṹ�У�������ִ����䡣
��������ִ��������Ȼ��������ִ������case�ṹ�е�
ִ����䣬֪������break�ؼ��ֻ��switch-case�ṹĩβ����Ϊֹ��

��break������ʹ����switch-case�ṹ�У���ʾһ��ִ�е�������switch-case�ṹ

��swtich�ṹ�еı��ʽ��ֻ��������6����������֮һ��byte/short/char/int/ö�����ͣ�JDK5.0������/String���ͣ�JDK7.0������

��case֮��ֻ����������������������Χ��

��break�ؼ�����switch-case�ṹ���ǿ�ѡ�ġ�

��default���൱��if-else�ṹ�е�else��
		  default�ṹ�ǿ�ѡ�ģ�����λ�������ġ�
*/

class SwitchCaseTest {
	public static void main(String[] args) {

		int number = 2;
		switch(number){
		
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("other");
		}
		
		String season = "summer"; 
		switch (season) {
		case "spring":
			System.out.println("��ů����"); 
			break;
		case "summer":
			System.out.println("��������"); 
			break;
		case "autumn":
			System.out.println("�����ˬ"); 
			break;
		case "winter":
			System.out.println("��ѩ����"); 
			break;
		default:
			System.out.println("������������"); 
			break;
		}
	}
}
