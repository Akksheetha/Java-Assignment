package Hands_on_2;
import java.util.Scanner;
public class DividingChocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of friends");
		int n = sc.nextInt();
		System.out.println("Enter no.of chocolates per preson : ");
		int[] arr = new int[n];
		int total = 0;
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			total+=arr[i];
		}
		if(total%n==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}