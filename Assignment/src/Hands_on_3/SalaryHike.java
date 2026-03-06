package Hands_on_3;
import java.util.Scanner;
public class SalaryHike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		The formula is Salary hike = oldSalaryPerMonth + (oldSalaryPerMonth X 
//				hike/100) 
		System.out.println("Enter the Old Salary : ");
		int old_salary = sc.nextInt();
		System.out.println("Enter the hike in percentage : ");
		int hike = sc.nextInt();
		System.out.println("The Employer's new salary with hike is "+calculateHike(old_salary,hike));
		
	}
	public static float calculateHike(int oldSalary, int hike) {
		float ans = oldSalary + (oldSalary*hike/100);
		return ans;
	}

}
