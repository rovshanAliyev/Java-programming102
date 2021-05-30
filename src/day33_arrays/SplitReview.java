package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] strArr = word.split("a");
        System.out.println(strArr.length);

        String word2 = "java1html2sql";
        String[] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        word2 = word2.replaceAll("\\d","_");
        System.out.println("word2 = " + word2);

        String password = "bcTddfsaf_a12sdf";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("valid password");
        } else {
            System.out.println("invalid password");
        }

    }
}
