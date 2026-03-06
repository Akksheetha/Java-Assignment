package Hands_on_3;
import java.util.Scanner;
public class OddAndEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n  = sc.nextInt();
		System.out.println("Enter the elements : ");
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Odd sum is "+OddSum(arr));
		System.out.println("Even sum is "+EvenSum(arr));
	}
	public static int OddSum(int[] arr) {
		int ans = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				ans+=arr[i];
			}
		}
		return ans;
	}
	public static int EvenSum(int[] arr) {
		int ans = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				ans+=arr[i];
			}
		}
		return ans;
	}

}
