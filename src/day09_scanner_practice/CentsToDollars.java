package day09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Write your cents here:");
        int cents = num.nextInt();
        int dollars = cents / 100;
        int remaniningCents = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + dollars);
        System.out.println("in " + cents + " cents: " + dollars + " dollar and " + remaniningCents + " cents.");
    }
}
