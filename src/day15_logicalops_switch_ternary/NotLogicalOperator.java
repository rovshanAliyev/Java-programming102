package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        if (!(age > 7)) {
            System.out.println("need to sit on child car seat. age = " + age);
        } else {
            System.out.println("can sit notmal seat. age = " + age);
        }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit please");
        } else {
            System.out.println("You can smoke here. Enjoy");
        }
        boolean isAffordable = false;
        if(!isAffordable) {
            System.out.println("Item is not affordable");
        } else {
            System.out.println("Item is affordable");
        }

        String carModel = "Tesla";
        if (!carModel.equals("Teslaa")) {
            System.out.println("Not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password`");
        }
    }
}
