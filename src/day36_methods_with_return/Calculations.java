package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10+45 = " + Calculator.add(10,45));
        System.out.println("100-40 = " + Calculator.minus(100,40));
        System.out.println("55/5 = " + Calculator.divide(55,5));
        System.out.println("8*3 = " + Calculator.multiply(8,3));

        double d1 = 100;
        double d2 = 50;
        double result = Calculator.minus(d1,d2);
        System.out.println(result);


    }
}
