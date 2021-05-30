package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains(" "));
        System.out.println(company.contains("l o"));
        System.out.println(company.contains("J"));
        System.out.println(company.contains("One"));


        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company name");
        }

        String firstName = "rovshan";
        if (firstName.contains("o") && firstName.contains("a")) {
            System.out.println("both o and a are present");
        } else {
            System.out.println("o || a are not present");
        }

        if (firstName.toUpperCase().contains("SH")) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
        }
    }
}
