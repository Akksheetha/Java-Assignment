package Java_practice;
import java.util.Scanner;
public class LuckyCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car no: ");
		int num = sc.nextInt();
		if(num < 1000 || num > 9999) {
			System.out.println("Number is not a valid car number");
		}
		else {
			int original = num;
			int sum = 0;
			while(num > 0) {
				int digit = num % 10;
				sum = sum + digit;
				num = num / 10;
			}
			if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
				System.out.println("Lucky Number");
			}
			else {
				System.out.println("Sorry it’s not lucky number");
			}
		}
	}

}
