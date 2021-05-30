package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
    Car car1 = new Car();
//    car1.model = "Honda Civic SI";
//    car1.year = 2020;
        car1.setModel("Nissan Altima");
        System.out.println("car1.getModel() = " + car1.getModel());
        
        car1.setYear(2020);
        System.out.println("car1.getYear() = " + car1.getYear());
        
        car1.setMileage(45_000);
        System.out.println("car1.getMileage() = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1);

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("romeo 23");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("model = " + alfaRomeo.getModel());
        System.out.println("year = " + alfaRomeo.getYear());
        System.out.println("mileage = " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);
    }
}
