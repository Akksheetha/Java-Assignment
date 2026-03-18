package Hands_on_10;
import java.util.*;
public class ArrayListForNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many names do you want to input : ");
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String> list = new ArrayList<>();
		String name;
		for(int i = 0;i<n;i++) {
			System.out.print("Enter name : ");
			name = sc.nextLine();
			list.add(name);
		}
		System.out.println("Names longer than 5 characters are");
		for(int i = 0;i<n;i++) {
			if((list.get(i)).length()>5) {
				System.out.println(list.get(i));
			}
		}
	}

}
