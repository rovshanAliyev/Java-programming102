package day18_conditions_practice_string_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 0;
        if (score >= 1 && score <= 40) {
            System.out.println(score + " is D");
        } else if (score >= 41 && score <= 60) {
            System.out.println(score + " is C");
        } else if (score >= 61 && score <= 80) {
            System.out.println(score + " is B");
        }else if (score >= 81 && score <= 100) {
            System.out.println(score + " is A");
        } else {
            System.out.println(score + " invalid");
        }
    }
}
