package Java_practice;
import java.util.Scanner;
public class BloodDonateEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter weight : ");
		int weight = sc.nextInt();
		if((age>18 && age<55) && (weight>45)) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}

	}

}
