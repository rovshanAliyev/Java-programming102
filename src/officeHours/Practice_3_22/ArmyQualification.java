package officeHours.Practice_3_22;

public class ArmyQualification {
    public static void main(String[] args) {
        String citizenship = "USA";
        boolean resident = true, hasDiploma = true;
        int age = 18;



        if (citizenship.equalsIgnoreCase("USA") || resident) {
            if (age >= 18 && age <=35) {

                if (hasDiploma) {
                    System.out.println("You are qualified for the US Army");
                } else {
                    System.out.println("You must have a high school diploma");
                }
            } else {
                System.out.println("Your age must be between 18 to 35");
            }
        } else {
            System.out.println("You must ne a U.S. citizen or a resident");
        }
    }
}
