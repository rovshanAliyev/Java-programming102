package officeHours.Practice_3_22;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println("Enter your name:");
        input.nextLine();  // cause we use nextANything before using nextLine...
        String name = input.nextLine();

        System.out.println("number = " + number);
        System.out.println("name = " + name);


    }
}
