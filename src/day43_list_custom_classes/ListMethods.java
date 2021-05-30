package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");
        System.out.println("dayNames = " + dayNames);
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("after remove = " + dayNames);


        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90);
        System.out.println(" after remove nums = " + nums);

    }
    public static List<String> getDays() {
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday",
                                                          "Thursday" , "Friday", "Saturday", "Sunday"));
        return days;
    }

    public static List<Integer> getRandomList(int size) {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            nums.add(random.nextInt(101));
        }
        return nums;
    }
}
