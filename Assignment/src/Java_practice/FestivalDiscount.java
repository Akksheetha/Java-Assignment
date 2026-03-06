package Java_practice;
import java.util.Scanner;
public class FestivalDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the cost of the items purchased : ");
		 double cost = sc.nextDouble();
		 double total_cost = 0;
		 double temp = 0;
		 if(cost<2000) {
			 temp = cost * 0.05;
			 total_cost = cost - temp;
		 }
		 else if(cost<5000) {
			 temp = cost * 0.25;
			 total_cost = cost - temp;
		 }
		 else if(cost<10000) {
			 temp = cost * 0.35;
			 total_cost = cost - temp;
		 }
		 else {
			 temp = cost * 0.50;
			 total_cost = cost - temp;
		 }
		 System.out.println("The total cost of the item purchased is "+total_cost);
	}

}
