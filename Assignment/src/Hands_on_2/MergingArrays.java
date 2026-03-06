package Hands_on_2;
import java.util.Scanner;
public class MergingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for both the arrays: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Enter the elements");
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		int c = 0;
		int[] newarr = new int[n1*n2];
		for(int i = 0;i<n1;i++) {
			arr1[i] = sc.nextInt();
			newarr[c++] = arr1[i];
		}
		for(int i = 0;i<n2;i++) {
			arr2[i] = sc.nextInt();
			newarr[c++] = arr2[i];
		}
		System.out.println("Merged Array");
		for(int i = 0;i<c;i++) {
			System.out.print(newarr[i]+" ");
		}
	}

}
