package day11_comparison_operators;

public class BooleanComparisonOpeerators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(1000 > 100);
        System.out.println(95 < 250);
        System.out.println(10 <= 11);
        System.out.println(5 >=3);
        System.out.println(100 != 44);

        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);
        
        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);
        
        result = 33 > 44;
        System.out.println("result = " + result);
        
        result = 88 < 99;
        System.out.println("result = " + result);
        
        result = 10 >= 10;
        System.out.println("result = " + result);
        
        result = 25 <= 15;
        System.out.println("result = " + result);
        
        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "Fairfax");
        
        String name = "Nadir" ;
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);

        int n1 = 5;
        int n2 = 3;

        System.out.println(n1 == n2);

        boolean check = n1 == n2;
        System.out.println(check);
        boolean check2 = n1 > n2;
        System.out.println(check2);
        boolean check3 = n1 != n2;
        System.out.println(check3);
    }
}
