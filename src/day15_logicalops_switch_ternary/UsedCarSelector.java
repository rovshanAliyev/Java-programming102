package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        int budget = 5000;
        int carPrice = 4500;
        String model = "Toyota";

        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))) {
            System.out.println("Ready to purchase model = " + model + ", price = " +carPrice);
        } else {
            System.out.println("Not interested in model = " + model + ", price = " +carPrice);
        }
    }
}
