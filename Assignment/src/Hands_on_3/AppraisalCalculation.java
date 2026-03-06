package Hands_on_3;
import java.util.Scanner;
public class AppraisalCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary : ");
		int salary = sc.nextInt();
		System.out.println("Enter Appraisal rate : ");
		double appraisal = sc.nextDouble();
		calculateAppraisal(salary,appraisal);
	}
	public static void calculateAppraisal(int salary, double appraisal) {
		double add = 0;
		if(appraisal<1 || appraisal>10) {
			System.out.println("Invalid Input");
			return;
		}
		else if(appraisal>1 && appraisal<4) {
			add = salary*0.10;
		}
		else if(appraisal>4 && appraisal<7) {
			add = salary*0.25;
		}
		else if(appraisal>7 && appraisal<10) {
			add = salary*0.30;
		}
		System.out.println("Salary after Appraisal is "+(salary+add));
	}

}
