package Hands_on_2;
import java.util.Scanner;
public class IdentifyingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search : ");
		int search = sc.nextInt();
		for(int i = 0;i<n;i++) {
			if(arr[i] == search) {
				System.out.println("True");
				return;
			}
		}
		System.out.println("False");
	}

}
