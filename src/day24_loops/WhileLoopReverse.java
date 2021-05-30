package day24_loops;

import java.util.Scanner;

public class WhileLoopReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("select the number");
        int count = scan.nextInt();
        while (count >= 0) {
            System.out.println("count = " + count);
            count--;
        }

        System.out.println("Finished the count");
    }
}
