package Hands_on_2;

import java.util.Arrays;
import java.util.Scanner;

public class HeightSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for three arrays: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.println("Enter the elements");
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		int[] arr3 = new int[n3];
		int c = 0;
		int[] newarr = new int[n1+n2+n3];
		for(int i = 0;i<n1;i++) {
			arr1[i] = sc.nextInt();
			newarr[c++] = arr1[i];
		}
		for(int i = 0;i<n2;i++) {
			arr2[i] = sc.nextInt();
			newarr[c++] = arr2[i];
		}
		for(int i = 0;i<n3;i++) {
			arr3[i] = sc.nextInt();
			newarr[c++] = arr3[i];
		}
		Arrays.sort(newarr);
		System.out.println("Merged and sorted Array");
		for(int i = 0;i<c;i++) {
			System.out.print(newarr[i]+" ");
		}
	}

}
