package Hands_on_3;
import java.util.Scanner;
public class HighestPlacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CS : ");
		int cse = sc.nextInt();
		System.out.println("Enter the no of students placed in EC : ");
		int ece = sc.nextInt();
		System.out.println("Enter the no of students placed in ME : ");
		int me = sc.nextInt();
		highestCheck(cse,ece, me);
	}
	public static void highestCheck(int cse, int ece, int me) {
		if(cse == ece && ece == me) {
			System.out.println("None of the department has got the highest placement ");
		}
		else if((cse<0) || (ece<0) || (me<0)) {
			System.out.println("Invalid Input");
		}
		else if((cse==ece) || (ece==me) || (cse == me)) {
			if(cse == ece) {
				System.out.println("Higheset Placement CS EC");
			}
			else if(ece == me) {
				System.out.println("Higheset Placement EC ME");
			}
			else {
				System.out.println("Higheset Placement CS ME");
			}
		}
		else if((cse>ece) || (cse>me)) {
			System.out.println("Highest Placement CS");
		}
		else if((ece>me) || (ece>cse)) {
			System.out.println("Highest Placement EC");
		}
		else {
			System.out.println("Highest Placement ME");
		}
	}

}
