package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            if (i == 3) {
                break;
            }
        }
        System.out.println();
        for (int n = 1; n <= 5; n++) {
            if (n == 3 || n == 4) {
                continue;
            }
            System.out.print(n);
        }
    }
}