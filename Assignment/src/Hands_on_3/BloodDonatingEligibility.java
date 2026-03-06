package Hands_on_3;
import java.util.Scanner;
public class BloodDonatingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter weighht : ");
		int weight = sc.nextInt();
		boolean ans1 = ageCheck(age);
		boolean ans2 = weightCheck(weight);
		if(ans1==true && ans2 == true) {
			System.out.println("You are eligible");
		}
		else {
			System.out.println("You are not eligible");
		}
	}
	public static boolean ageCheck(int age) {
		if(age>18 && age<55) {
			return true;
		}
		return false;
	}
	public static boolean weightCheck(int weight) {
		if(weight>45) {
			return true;
		}
		return false;
	}

}
