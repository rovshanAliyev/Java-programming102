package day06_artithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "Tesla";
        String driverName = "Rovshan";
        String licenseNum = "127-ABC";
        short speed = 65;
        boolean isAutomatic = true;
        char licenseClass = 'c';

        System.out.println("Car model is : "+ carModel);
        System.out.println(carModel + " is car model");
        System.out.println(driverName + " is the driver");
        System.out.println("License number is "+ licenseNum);
        System.out.println(driverName + " is driving the car "+ speed + "mph");
        System.out.println(driverName + " is driving "+ carModel + " around " + speed + "mph");
        System.out.println("Is car automatic: " + isAutomatic);
        System.out.println(licenseClass+" "+ isAutomatic);
        // + only works when their is a String inside ("")


    }
}
