package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';

        if ((grade == 'A' || grade == 'a') || grade == 'B' || grade == 'C') {
            System.out.println("Pass with the grade " + grade);
        } else if (grade == 'D') {
            System.out.println("Qua;ify for retake " + grade);
        } else if (grade == 'E') {
            System.out.println("Fail with the grade " + grade);
        } else {
            System.out.println("Invalid grade " + grade);
        }

    }
}
