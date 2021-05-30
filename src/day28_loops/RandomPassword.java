package day28_loops;

import java.util.Random;
import java.util.Scanner;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for (int i = 1; i <= 18; i++) {
            int index = random.nextInt(71);
            System.out.print(source.charAt(index));
            password += source.charAt(index);
        }
        System.out.println("\npassword = " + password);
    }
}