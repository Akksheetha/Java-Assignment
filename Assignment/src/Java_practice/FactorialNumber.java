package Java_practice;
import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<1) {
			System.out.println("Invalid Input");
		}
		for(int i = 2;n>=1;i++) {
			n/=i;
			if(n==1) {
				System.out.println(i);
				return;
			}
			else if(n<0) {
				System.out.println("Sorry, The given number is not a perfect factorial");
				return;
			}
		}
	}
}
