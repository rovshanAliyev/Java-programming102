package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 88;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("result = " + result);
        
        String quality = "good";
        int rating = (quality.equals("good")) ? 100 : 0;
        System.out.println("rating = " + rating);

        String quality1 = "good";
        System.out.println(quality1.equals("good") ? 100 : 0);
        System.out.println("quality1 = " + quality1);
        
        int score3 = 100;
        char grade = (score3 > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);
    }
}
