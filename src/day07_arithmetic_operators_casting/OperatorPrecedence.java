package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10 + 5);
        System.out.println(10 + 5 - 3);
        System.out.println(10 + 5 * 3);
        System.out.println(10 - (5 + 3));

        System.out.println(20 / 4 * 2 );
        System.out.println(20 / (4 * 2));

        System.out.println(10 / 3);
        System.out.println(5 / 2);
    //         if you need math precision never use int or whole numbers. Use decimal points number double or float.
    //          division
        System.out.println(10.0 / 3.0);
        System.out.println(5.0 / 2);
        int num1 = 40;
        int num2 = 15;
        System.out.println(num1 / num2);
        double num3 = 40;
        double num4 = 15;
        System.out.println(num3 / num4);
        double num5 = 120;
        int num6 = 25;
        System.out.println(num5 / num6);


    }
}
