package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 1000.35;
        if (salesAmount <= 2000) {
            System.out.println("Good job, you are qualified for bonus");
            bonus = 50.0;
        } else {
            System.out.println("Great job, you qualified for bonus");
            bonus = 100.0;
        }
        System.out.println("Yout total bonus is: $" + bonus);
    }
}
