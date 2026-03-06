package Java_practice;
import java.util.Arrays;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
	}
}
