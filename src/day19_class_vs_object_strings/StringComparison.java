package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Baku";
        System.out.println(city.equals("Baku"));
        System.out.println(city.equals("baku "));
        System.out.println(city.equals("BAKU"));

        System.out.println(city.equalsIgnoreCase("BAKU"));
        System.out.println(city.equalsIgnoreCase("baku"));
        System.out.println(city.equalsIgnoreCase("BaKu"));

        if(city.equals("BAKU")) {
            System.out.println("equals() true");
        } else {
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("BAKU")) {
            System.out.println("equals() true");
        } else {
            System.out.println("equals() false");
        }


    }
}
