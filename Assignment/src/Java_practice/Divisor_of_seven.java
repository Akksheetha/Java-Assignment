package Java_practice;
import java.util.Scanner;
public class Divisor_of_seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%7 == 0) {
			System.out.println("The entered number is the exact divisor of 7");
		}
	}

}
