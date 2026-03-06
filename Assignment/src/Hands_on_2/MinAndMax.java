package Hands_on_2;
import java.util.Scanner;
public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i = 0;i<n;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("The largest value is "+largest);
		System.out.println("The smallest value is "+smallest);
	}

}
