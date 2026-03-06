package Java_practice;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 digit number : ");
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		if(sum == original) {
			System.out.println("It is an Armstrong number");
		}
		else {
			System.out.println("It is not an Armstrong number");
		}
	}

}
