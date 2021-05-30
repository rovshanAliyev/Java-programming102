package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your hourly rate: ");
        double rate = scan.nextDouble();
        double weeklyPaid = rate * 40;
        double monthlyPaid = weeklyPaid * 52 / 12;
        double annualPay = monthlyPaid * 12;
        System.out.println("Yours weekly paid would be: " + weeklyPaid);
        System.out.println("Your montly paid would be: " + monthlyPaid);
        System.out.println("Your annual paid would be: " + annualPay);

    }
}
