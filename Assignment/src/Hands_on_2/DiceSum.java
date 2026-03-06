package Hands_on_2;
import java.util.Scanner;
public class DiceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player 1's 10 choices");
		int[] arr1 = new int[10];
		int player1 = 0;
		for(int i = 0;i<10;i++) {
			arr1[i] = sc.nextInt();
			player1+=arr1[i];
		}
		System.out.println("Enter player 2's 10 choices");
		int[] arr2 = new int[10];
		int player2 = 0;
		for(int i = 0;i<10;i++) {
			arr2[i] = sc.nextInt();
			player2+=arr2[i];
		}
		if(player1>player2) {
			System.out.println("Player1 wins");
		}
		else {
			System.out.println("Player2 wins");
		}

	}

}
