package day15_logicalops_switch_ternary;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int oranges = 7;
        System.out.println(apples > 3 || oranges > 4);
        if (apples > 3 || oranges >4) {
            System.out.println("No need to buy any more fruit");
        } else {
            System.out.println("get some fruits please");
        }
        System.out.println(apples > 3 || oranges >10);
        if (apples > 3 || oranges >10) {
            System.out.println("No need to buy any more fruit");
        } else {
            System.out.println("get some fruits please");
        }
        System.out.println(apples > 7 || oranges > 5);
        if (apples > 7 || oranges > 5) {
            System.out.println("No need to buy any more fruit");
        } else {
            System.out.println("get some fruits please");
        }
        System.out.println(apples != 5 || oranges != 7);
        if (apples != 5 || oranges != 7) {
            System.out.println("No need to buy any more fruits");
        } else {
            System.out.println("get some fruits please");
        }
    }
}
