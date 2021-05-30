package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedrooms = 10;
        int startingPrice = 0;
        System.out.println("Welcome to UNION apartments");

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studie apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
            default:
                System.out.println("Currently " +numberOfBedrooms+ " bedroom not available");
                return;
        }
        System.out.println("Starting price: $" +startingPrice);
    }
}
