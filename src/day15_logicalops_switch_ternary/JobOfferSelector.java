package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "WA state";
        int salary = 120_000;
        boolean remote = true, benefits = true;
        if (location.equals("WA state") && salary >= 120_000 && remote && benefits) {
            System.out.println("Sure, i will accept the offer");
        } else {
            System.out.println("lets consider other offer or negotiate");
        }
    }
}
