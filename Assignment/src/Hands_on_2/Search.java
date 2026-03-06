package Hands_on_2;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean is = false;
		System.out.println("Enter the elements");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search : ");
		int c =0;
		int search = sc.nextInt();
		for(int i = 0;i<n;i++) {
			if(arr[i] == search) {
				is = true;
				c++;
			}
		}
		if(is) {
			System.out.println("The number "+ search +" appears "+c+" times");
		}
		else {
		System.out.println("Element not found");
		}
	}

}
