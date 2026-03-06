package Java_practice;
import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Wages per day : ");
		int wages = sc.nextInt();
		System.out.println("Enter no.of working days : ");
		int no_of_days = sc.nextInt();
		System.out.println("Your Total salary is "+wages*no_of_days);
	}
}
