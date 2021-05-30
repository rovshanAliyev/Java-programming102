package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 24;
        boolean isPrimeMember = false;
        if (isPrimeMember) {
            System.out.println("Eligible for free 2 day shopping");
        } else {
            if (itemPrice > 25) {
                System.out.println("Eligible for free regularr shopping");
            } else{
                System.out.println("Not eligible for free shipping. Fee is $10");
            }
        }
    }
}
