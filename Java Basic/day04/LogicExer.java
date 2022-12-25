class LogicExer {
	public static void main(String[] args) {
		
		int i1 = 3;
		int i2 = 4;
		int i3 = i1 + i2;

		if(i1 > 0 & (i3 += 2) > 10){//  输出 not all true
		//if(i1 > 0 & (i3 += 2) > 8){   输出 all true
			System.out.println("all true");
			System.out.println("i3 = " + i3);
		}else{
			System.out.println("not all true");
			System.out.println("i3 = " + i3);
		}

		int ii1 = 5;
		int ii2 = 6;
		int ii3 = ii1 + ii2;

		if(ii1 > 0 && (ii3 += 2) > 13){//  输出 not all true
		//if(ii1 > 0 && (ii3 += 2) > 11){   输出 all true
			System.out.println("all true");
			System.out.println("ii3 = " + ii3);
		}else{
			System.out.println("not all true");
			System.out.println("ii3 = " + ii3);
		}

		int iii1 = 5;
		int iii2 = 6;
		int iii3 = iii1 + iii2;

		if(iii1 > 11 && (iii3 += 2) > 13){//  输出 not all true
		//if(iii1 > 0 && (iii3 += 2) > 11){   输出 all true
			System.out.println("all true");
			System.out.println("iii3 = " + iii3);
		}else{
			System.out.println("not all true");
			System.out.println("iii3 = " + iii3);
		}
	}
}
