package officeHours.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class day1 {
    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();

        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);



        return Arrays.toString(ch1).equals(Arrays.toString(ch2));

//        for (char each : ch1)
//
//            a1 += each;
//
//
//        for (char each : ch2)
//
//            a2 += each;

    }

    public static void main(String[] args) {
        System.out.println(same("abc", "cba"));

    }

}
