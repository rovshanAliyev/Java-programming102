package day09_scanner_practice;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first lucky number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second lucky number: ");
        int num2 = scan.nextInt();
        int results = num1+num2;
        System.out.println(" your lucky number is: " + results);
    }
}
