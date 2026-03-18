package Hands_on_7;
import java.util.Scanner;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		boolean[] visited = new boolean[arr.length];
		for(int i = 0;i<arr.length;i++) {
			if(visited[i]) {
				continue;
			}
			if(arr[i]==' ') {
				System.out.print(" ");
				continue;
			}
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					visited[j] = true; 
					break;
				}
			}
			if(!visited[i]) {
				System.out.print(arr[i]);
			}
		}
	}

}
