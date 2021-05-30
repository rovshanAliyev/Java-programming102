package officeHours.Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>(Arrays.asList(
                "during", "storm", "rain", "fell", "season", "cloudy", "safe"
        ));

        ArrayList<Integer> lengths =new ArrayList<>();
        for (String word: nums) {
            lengths.add(word.length());
        }
        System.out.println(lengths);
    }

    
}