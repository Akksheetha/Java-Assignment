package Java_practice;
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		int letters = 0;
		int digits = 0;
		int others = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				letters++;
			}
			else if(ch>='0' && ch<='9') {
				digits++;
			}
			else if(ch==' ') {
				continue;
			}
			else {
				others++;
			}
		}
		System.out.println("Letters: " + letters + ", Digits: " + digits + ", Other Symbols: " + others);
	}

}
