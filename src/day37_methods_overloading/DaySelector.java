package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(9));

        for (int i = 1; i <= 8; i++) {
            System.out.println(getDayName(i));
        }
        String newDate = getDayName(7);
        System.out.println(newDate);
        System.out.println(getDayNameV2(4));
    }
    public static String getDayName(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("Invalid day " + day);
                return null;
        }
    }
    public static String getDayNameV2(int day) {
        String dayName;
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thrusday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7:dayName = "Sunday"; break;
            default:
                System.out.println("Invalid day " + day);
                dayName = null;

        }
        return dayName;
    }
}
