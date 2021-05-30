package day14_multi_branch_if_sstatements;

import java.util.Scanner;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number between 1-7:");
        int day = scan.nextInt();
        if (day == 1) {
            System.out.println("It is Monday");
        }
        if (day == 2) {
            System.out.println("It is Tuesday");
        }
        if (day == 3) {
            System.out.println("It is Wednesday");
        }
        if (day == 4) {
            System.out.println("It is Thrusday");
        }
        if (day == 5) {
            System.out.println("it is Friday");
        }
        if (day == 6) {
            System.out.println("It is Saturday");
        }
        if (day == 7) {
            System.out.println("It is Sunday");
        }
        System.out.println("Have a good week");


        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }
        System.out.println("Have a great week");
    }
}
