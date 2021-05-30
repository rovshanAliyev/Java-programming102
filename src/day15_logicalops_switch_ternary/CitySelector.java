package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Baku";
        if (city.equals("Baku") || city.equals("LA")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is Jave class");
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some class with " + teacher);
        }

        String company = "Google";
        int salary = 100_000;
        if (company.equals("Google") || salary >= 100_000) {
            System.out.println("I would like to accept the offer " + company);
        } else {
            System.out.println("I cant accept this offer " + company);
        }





    }
}
