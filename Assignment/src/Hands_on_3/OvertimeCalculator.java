package Hands_on_3;
import java.util.Scanner;

public class OvertimeCalculator {
    public static int calculateOvertime(int hours) {
        if (hours > 40) {
            return (hours - 40) * 15;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter working hours of employee " + i + ": ");
            int hours = sc.nextInt();
            int overtimePay = calculateOvertime(hours);
            System.out.println("Overtime pay of employee " + i + " is Rs." + overtimePay);
        }

        sc.close();
    }
}
