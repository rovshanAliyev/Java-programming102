package officeHours.Practice1;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 10;
        if (age > 0 && age < 120) {
            if (age <= 2) {
                System.out.println("Infant");
            } else if (age >= 3 && age <= 5) {
                System.out.println("Toddler");
            } else if (age >= 6 && age <= 9) {
                System.out.println("Pre-teen");
            } else {
                System.out.println("Old Senior Citizen");
            }
        }else {
            System.out.println("Invalid age");
        }
    }
}
