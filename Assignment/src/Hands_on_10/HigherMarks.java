package Hands_on_10;
import java.util.*;
public class HigherMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		System.out.print("Enter no.of students : ");
		int n = sc.nextInt();
		sc.nextLine();
		String name;
		int marks;
		for(int i = 0;i<n;i++) {
			System.out.print("Enter name : ");
			name = sc.nextLine();
			System.out.print("Enter Marks : ");
			marks = sc.nextInt();
			sc.nextLine();
			map.put(name,marks);
		}
		System.out.println("Student marks in the HashMap : "+map);
		
	}

}
