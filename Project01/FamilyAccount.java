

class FamilyAccount {
	public static void main(String[] args) {

		boolean isFlag = true;
		String details = "��  ֧		�˻����	��֧���	˵  ��\n";
		//��¼�û�����֧������
		int balance = 10000;

		while (isFlag){
			
			System.out.println("---------------��ͥ��֧��������---------------\n");
			System.out.println("                 1 ��֧��ϸ");
			System.out.println("                 2 �Ǽ�����");
			System.out.println("                 3 �Ǽ�֧��");
			System.out.println("                 4 ��    ��\n");
			System.out.print("                 ��ѡ��1-4����");
			
			//��ȡ�û���ѡ��1-4
			char selection = Utility.readMenuSelection();
			switch (selection){

			case '1':
				//System.out.println("1.��֧��ϸ");
				System.out.println("---------------��ǰ��֧��ϸ��¼---------------");
				System.out.println(details);
				System.out.println("----------------------------------------------");
				break;
			case '2':
				//System.out.println("2.�Ǽ�����");
				System.out.print("���������");
				int addMoney = Utility.readNumber();
				System.out.print("��������˵����");
				String addInfo = Utility.readString();

				//����details
				details += ("��  ��\t\t" + balance + "\t\t" + addMoney + "\t\t" + addInfo + "\n");

				//����balance
				balance += addMoney;

				System.out.println("-------------------�Ǽ����-------------------");
				break;
			case '3':
				//System.out.println("3.�Ǽ�֧��");
				System.out.print("����֧����");
				int minusMoney = Utility.readNumber();
				System.out.print("����֧��˵����");
				String minusInfo = Utility.readString();

				//����balance
				if (balance >= minusMoney){
					balance -= minusMoney;

					//����detail
					details += ("֧  ��\t\t" + balance + "\t\t" + minusMoney + "\t\t" + minusInfo + "\n");

				}else{
					System.out.print("֧�������˻���ȣ�֧��ʧ��");
				}
				
				System.out.println("-------------------�Ǽ����-------------------");
			    break;
			case '4':
				//System.out.println("4.�˳�");	
				System.out.println("ȷ���Ƿ��˳�(Y/N)");
				char isExit = Utility.readConfirmSelection();
				if (isExit == 'Y'){
					isFlag = false;
				}
			
			}
		}
		
	}
}