package Hands_on_10;
import java.util.*;
public class CountingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine().toLowerCase();
		for(int i = 0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
		}
		System.out.println(map);
	}

}
