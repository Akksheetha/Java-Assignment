package Hands_on_2;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,3,5,7,9};
		int arr2[] = {2,4,6,8,10};
		int add1 = 0,add2 = 0;
		for(int i = 0;i<arr1.length;i++) {
			add1 += arr1[i];
		}
		for(int i = 0;i<arr2.length;i++) {
			add2 += arr2[i];
		}
		System.out.println("Array 1(odd) sum is "+add1);
		System.out.println("Array 2(even) sum is "+add2);
	}

}
