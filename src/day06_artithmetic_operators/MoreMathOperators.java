package day06_artithmetic_operators;

public class MoreMathOperators {
    public static void main(String [] args) {
        int toyotas = 431;
        int hondas = 233;
        int vws = 2;;
        int teslas = 20;
        int nissans = 1;
        int bmws = 155;
        // int toyotas = 431, hondas = 2, vws = 233, teslas = 20,

        int totalCarsInParking = toyotas + hondas + vws + teslas + nissans + bmws;

        System.out.println(totalCarsInParking);
        System.out.println("There are " + totalCarsInParking + " cars in the parking lot.");

        String pizza = "hawain";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;

        System.out.println(slicesPerPerson);
        System.out.println("There are " + slicesPerPerson + " slices per person");
        System.out.println("We order " + pizza + " pizza with " + slices + " slices, " + people + " people ate 2 slices." );
    }
}
