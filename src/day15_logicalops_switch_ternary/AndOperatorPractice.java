package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {

        String itemName = "TV stand";
        boolean onSale = true;
        boolean freeShipping = true;
        if (onSale && freeShipping) {
            System.out.println("You can purchased the " + itemName);
        } else {
            System.out.println("Keep looking for another " + itemName);
        }

        if (freeShipping && onSale && itemName.equals("TV stand")) {
            System.out.println("You can purchased the " + itemName);
        } else {
            System.out.println("Keep looking for another " + itemName);
        }
    }
}
