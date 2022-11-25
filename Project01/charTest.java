
import java.util.Scanner;

class charTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char c = str.charAt(0);
		if (c == 'N'){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
