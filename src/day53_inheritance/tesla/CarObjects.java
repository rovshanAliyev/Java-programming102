package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Model Y", "Tesla", 48190, 2021, 236);
        ec1.drive(50);
        System.out.println(ec1);
        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 price = " + ec1.getPrice());
        System.out.println("ec1 year = " + ec1.getYear());
        System.out.println("ec1 range = " + ec1.getRange());

        if (ec1.getPrice() > 10000) {
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + " is out of my budget");
        } else {
            System.out.println("purchasing " + ec1.toString());
        }

        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("CyberTruck", "Tesla", 59000, 2022, 300);
        System.out.println(ec2.toString());

        System.out.println(ElectricCar.getCount());

        Roadster roadster = new Roadster("Roadster", 200000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());

        ModelX modelX = new ModelX("Model X", "Tesla", 89000, 2021, 360);
        System.out.println(modelX.toString());
        modelX.drive(25);
        System.out.println("Having a dinner");
        modelX.drive(25);
        System.out.println("Range remaining = " + modelX.getRange());
        System.out.println("Total electric cars count = " + ElectricCar.getCount());



    }
}
