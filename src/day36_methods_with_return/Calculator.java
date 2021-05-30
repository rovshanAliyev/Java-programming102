package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(24, 21));
        double sum = add(15, 7);
        System.out.println(sum);
        System.out.println(minus(15, 4));
        System.out.println(multiply(3, 4));
        System.out.println(divide(15, 3));
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double minus(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}