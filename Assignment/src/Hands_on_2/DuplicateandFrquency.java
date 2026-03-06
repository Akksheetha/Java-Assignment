package Hands_on_2;
import java.util.Scanner;
public class DuplicateandFrquency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Enter the elements");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
       }
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(visited[i] == true)
                continue;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
        }
        System.out.println("There are "+count+" Duplicate Elements and "+(n-count-count)+" Unique Elements");
    }
}

