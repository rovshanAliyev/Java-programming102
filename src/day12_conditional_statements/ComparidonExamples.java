package day12_conditional_statements;

import java.util.Scanner;

public class ComparidonExamples {
    public static void main(String[] args) {

        int currentSpeed = 45;
        int speedLimit = 55;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        double accountBalance = 250.25;
        double itemPrice = 100;
        System.out.println(itemPrice <= accountBalance);
        System.out.println("can i afford : " + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = " + canAfford);

        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);


    }
}
