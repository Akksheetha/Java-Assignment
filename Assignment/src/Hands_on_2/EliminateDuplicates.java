package Hands_on_2;
import java.util.Scanner;
public class EliminateDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements : ");
		int[] arr = new int[n];
		boolean[] visited = new boolean[n];
		int c= 0;
		for(int i = 0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		int[] newarr = new int[n];
		for(int i = 0;i<n;i++) {
			if(visited[i] == true) {
				continue;
			}
			newarr[c++] = arr[i];
			for(int j = i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					visited [j] = true;
					break;
				}
			}
		}
		System.out.println("Unique Elements are ");
		for(int i = 0;i<c;i++) {
			System.out.print(newarr[i]+" ");
		}
	}

}
