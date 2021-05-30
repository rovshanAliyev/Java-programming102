package day24_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNumber.nextInt(101);
        int guessingNumber;
        do {
            System.out.println("Guess the secret number:");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("Wrong, your number is too large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong, your number is too small");
            }
        } while (guessingNumber != secretNumber);

        System.out.println("Congrats you won");
    }
}
