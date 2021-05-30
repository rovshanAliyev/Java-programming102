package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int star = 1; star <= 10; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int star = 10; star >= i; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
