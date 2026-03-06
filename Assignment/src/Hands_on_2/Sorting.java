package Hands_on_2;
import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int small = arr[0];
		for(int i = 0;i<n;i++) {
			small = i;
			for(int j =i+1;j<n;j++) {
				if(arr[j]<arr[small]) {
					small = j;
				}
			}
			if(i!=small) {
			arr[i] = arr[i]^arr[small];
			arr[small] = arr[i]^arr[small];
			arr[i] = arr[i]^arr[small];
			}
		}
		System.out.println("After sorting");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
