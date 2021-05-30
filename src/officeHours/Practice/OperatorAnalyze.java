package officeHours.Practice;

public class OperatorAnalyze {
    public static void main(String[] args) {
//        int a = 5; // a = 6
//        int b = a++ + a-- + a * 2 + a + ++a;
//        //      5   + 6   + 5 * 2 + 5 + 6
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        int a = 200; // a =199
        int b =-a++ + - --a * a-- % 2 + a;
        //     _200 + - 200 * 200 % 2 + 199
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
