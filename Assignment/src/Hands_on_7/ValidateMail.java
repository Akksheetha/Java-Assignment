package Hands_on_7;
import java.util.Scanner;
public class ValidateMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean isCorrect = true;
		if((str.charAt(0)>='A' && str.charAt(0)<='Z')) {
			System.out.println("Invalid");
			return;
		}
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				continue;
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				continue;
			}
			else if(str.charAt(i)=='.' || str.charAt(i)=='_' || str.charAt(i)=='_') {
				continue;
			}
			else if(str.charAt(i)=='@') {
				for(int j = i+1;j<str.length();j++) {
					if(str.charAt(i)=='.') {
						continue;
					}
					
				}
			}
		}
	}

}
