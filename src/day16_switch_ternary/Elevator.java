package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;
        if (floorNum == 1) {
            System.out.println("Floor 1 selected.");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected.");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected.");
        } else {
            System.out.println("Invalid floor - " + floorNum);
        }


        System.out.println("===========SSWITCH STATEMENT VERSION========");
        floorNum = 3;
        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected.");
                break;
            case 2:
                System.out.println("Floor 2 selected.");
                break;
            case 3:
                System.out.println("Floor 3 selected.");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
        }

    }
}
