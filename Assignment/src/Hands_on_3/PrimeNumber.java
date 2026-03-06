package Hands_on_3;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=0;
		for(int i = 2;i<=100;i++) {
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
