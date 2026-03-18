package Hands_on_7;
import java.util.Scanner;
public class Trimming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		System.out.print("\"");
		System.out.print(myTrim(str));
		System.out.print("\"");
		System.out.println("Program finished");
		sc.close();
	}
	public static String myTrim(String str) {

		String newString = "";
		int start = 1;
		int end = str.length() - 2;
		while(start <= end && str.charAt(start) == ' ') {
			start++;
		}
		while(end >= start && str.charAt(end) == ' ') {
			end--;
		}
		for(int i = start; i <= end; i++) {
			newString += str.charAt(i);
		}

		return newString;
	}

}
