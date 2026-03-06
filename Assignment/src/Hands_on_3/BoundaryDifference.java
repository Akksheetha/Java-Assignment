package Hands_on_3;
import java.util.Scanner;
public class BoundaryDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd = OddSum();
		System.out.println("The sum of odd numbers from 1 to 1000 is "+odd);
		int even = EvenSum();
		System.out.println("The sum of even numbers from 1 to 1000 is: "+even);
		System.out.println("The absolute difference between the two sums is "+(even-odd));
	}
	public static int OddSum() {
		int ans = 0;
		for(int i = 1;i<=1000;i++) {
			if(i%2!=0) {
				ans+=i;
			}
		}
		return ans;
	}
	public static int EvenSum() {
		int ans = 0;
		for(int i = 1;i<=1000;i++) {
			if(i%2==0) {
				ans+=i;
			}
		}
		return ans;
	}

}
