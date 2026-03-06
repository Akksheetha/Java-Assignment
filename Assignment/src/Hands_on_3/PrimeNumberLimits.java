package Hands_on_3;
import java.util.Scanner;
public class PrimeNumberLimits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting limit : ");
		int start = sc.nextInt();
		System.out.println("EnterEnding limit : ");
		int end = sc.nextInt();
		if(start>end) {
			System.out.println("Provide valid input");
			return;
		}
		int ans=0;
		System.out.println("Prime numbers between the limits are");
		for(int i = start;i<=end;i++) {
			ans = primeCheck(i);
			if(ans>0) {
				System.out.print(i+" ");
			}
		}
	}
	public static int primeCheck(int a) {
		boolean is = true;
		for(int i = 2;i<=(int)Math.sqrt(a);i++) {
			if(a%i==0) {
				is = false;
				break;
			}
		}
		if(is) {
			return a;
		}
		else {
			return -1;
		}
	}

}
