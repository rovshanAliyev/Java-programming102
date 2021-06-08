package officeHours.Practice;

import java.util.Scanner;

public class day1 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            day0 a = new day0();
            a.name = in.next();
            a.color = in.next();
            a.amount = in.nextInt();

            System.out.println(a.asString());
        }
    }