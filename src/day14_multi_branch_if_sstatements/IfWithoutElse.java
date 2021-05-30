package day14_multi_branch_if_sstatements;

import java.util.Scanner;

public class IfWithoutElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scan.nextInt();
        if (year >= 2020) {
            System.out.println("Covid19 pandemic year");
            System.out.println("Dont forget to wear the mask");
        }

        System.out.println("Keep coding java");

        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pensylvania ave");
        }

        System.out.println("Welcome to " + country);
    }
}
