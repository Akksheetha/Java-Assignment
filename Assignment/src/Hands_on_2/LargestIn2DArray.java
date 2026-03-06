package Hands_on_2;
import java.util.Scanner;

public class LargestIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
			arr[i][j] = sc.nextInt();
			}
		}
		int largest = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
			if(arr[i][j]>largest) {
				largest = arr[i][j];
			}
			}
		}
		System.out.println("The largest value is "+largest);
	}

}
