package day14_multi_branch_if_sstatements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        int apples = 10, orange = 5;
        boolean check = apples > 5 && orange > 3;
        System.out.println("check = " + check);

        if (apples > 6 && orange > 2) {
            System.out.println("I have enough apples and oranges");
        } else {
            System.out.println("I need to go to Costco for shopping");
        }
    }
}
