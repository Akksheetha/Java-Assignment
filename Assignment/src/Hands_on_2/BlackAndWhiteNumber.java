package Hands_on_2;
import java.util.*;
public class BlackAndWhiteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the values : ");
	    int i = 0,n = 0;
		while(true) {
			n = sc.nextInt();
			if(n<0) {
				break;
			}
			else if((n%7==0) && (n%8==0)) {
				list.add(-6);
			}
			else if(n%7==0) {
				list.add(-2);
			}
			else if(n%8==0) {
				list.add(-9);
			}
			else {
			list.add(n);
			}
		}
		for(int j : list) {
			System.out.print(j+" ");
		}
	}

}
