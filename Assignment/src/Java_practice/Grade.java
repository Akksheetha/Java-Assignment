package Java_practice;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double exercise, exam;
		double final_grade;
		double sum = 0;
		int count = 0;
		while(true) {
			System.out.println("Enter exercise grade : ");
			exercise = sc.nextDouble();
			System.out.println("Enter exam grade : ");
			exam = sc.nextDouble();
			if(exercise == -1 || exam == -1) {
				break;
			}
			if(exercise < 0 || exercise > 10 || exam < 0 || exam > 10) {
				System.out.println("Invalid grade. Grades must be between 0 and 10.");
				continue;
			}
			if(exercise >= 5 && exam >= 5) {
				final_grade = (exercise * 0.30) + (exam * 0.70);
			}
			else {
				if(exercise < exam) {
					final_grade = exercise;
				}
				else {
					final_grade = exam;
				}
			}
			System.out.println("Final Grade is " + final_grade);
			sum = sum + final_grade;
			count++;
		}
		if(count > 0) {
			System.out.println("Average Grade is " + (sum / count));
		}
		else {
			System.out.println("No student data entered.");
		}
	}

}
