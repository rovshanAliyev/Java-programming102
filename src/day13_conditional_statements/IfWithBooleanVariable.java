package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        System.out.println("Are you hungry: ");

        if (false) {
            System.out.println("I am hungry");
            System.out.println("Lets do some java");
        } else {
            System.out.println("Im not hungry");
            System.out.println("I will still do Java");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200.0;

        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it");
        } else {
            System.out.println("I cant afford it ");
        }

        boolean isRemoteJob = true;
        //if (isAffordable == false)
       //if (isAffordable !+)
        if (!isAffordable) {
            System.out.println("Sorry, I am not interested");
        } else {
            System.out.println("Sure, I am interested");
        }


    }
}
