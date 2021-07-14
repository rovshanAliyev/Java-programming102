package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int min = 30;
        System.out.println("Class is going on for " + min + " minutes");
        if (min > 50) {
            throw new BreakTimeException("It is a break time");
        }
        System.out.println("Continue the class");

        double balance = 400;
        double itemPrice = 500;
        System.out.println("I have $" + balance + " and purchasing item for $" + itemPrice);
        if (itemPrice > balance) {
            throw new BreakTimeException("Transaction declined. Not enough funds");
        }
        System.out.println("Item successfully purchased");
    }
}
