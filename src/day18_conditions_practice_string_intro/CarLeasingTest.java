package day18_conditions_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "bmw";
        String model = "R";
        double leasePrice = 0;

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500;
            } else if (model.equals("A")) {
                leasePrice = 400;
            }
        } else if (make.equals("Audi")) {
            if (model.equals("S")) {
                leasePrice = 700;
            } else if (model.equals("R")) {
                leasePrice = 900;
            }
        } else {
            System.out.println("Invalid make");
            return;
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }
}
