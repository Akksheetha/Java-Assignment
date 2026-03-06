package Java_practice;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of i : ");
		int i = sc.nextInt();
		int sum = 0;
		int n = 1;
		do {
			sum = sum + n;
			n++;
		} while(n <= i);
		System.out.println("Sum of series is " + sum);
	}

}
