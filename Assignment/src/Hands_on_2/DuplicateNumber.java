package Hands_on_2;
import java.util.Scanner;
public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size size of an array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements : ");
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("The duplicate number in the array is "+arr[i]);
					return;
				}
			}
		}
	}

}
