package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.sum(10,5);
        sum(10.4,10.5);
        sum(1,4,2);
        sum("13","123");
    }
    public static void sum(int num1, int num2) {
        System.out.println("sum(int num1, int num2)");
        System.out.println("result = " + (num1 + num2));
    }
    public static void sum(double num1, double num2) {
        System.out.println("sum(double num1, double num2)");
        System.out.println("result = " + (num1 + num2));
    }
    public static void sum(int num1, int num2, int num3) {
        System.out.println("sum(int num1, int num2, int num3)");
        System.out.println("result = " + (num1 + num2 + num3));
    }
    public static void sum(String str1, String str2) {
        System.out.println("sum(String str1, String str2)");
        System.out.println("result = " + (str1 + str2));
    }
}
