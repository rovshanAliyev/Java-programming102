package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 4, 5, 3);
        System.out.println("nums = " + nums);
        List<Integer> nums1 = new ArrayList(Arrays.asList( 23, 1 ,34 , 54));
        nums1.add(33);
        nums1.add(150);
        System.out.println("nums1 = " + nums1);
        nums1.remove(0);
        nums1.remove(new Integer(34));
        System.out.println("nums1 = " + nums1);

        List<String> drinkWithCa = new ArrayList<>(Arrays.asList("coffee", "tea", "monster",
                "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));

        System.out.println("drinkWithCa = " + drinkWithCa);
        int caffeineAmount =0;

        for (String drink : drinkWithCa) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drink + " ---> " + caffeineAmount);
            } else if (drink.equals("coffee") || drink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(drink + " ---> " + caffeineAmount);
            } else if (drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(drink + " ---> " + caffeineAmount);
            }
        }

        for (String drink1 : drinkWithCa) {
            switch (drink1) {
                case "monster": case "redbull": case"celsius":
                    caffeineAmount = 150;
                    System.out.println(drink1 + " ---> " + caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink1 + " ---> " + caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink1 + " ---> " + caffeineAmount);
                    break;
            }
        }

        drinkWithCa.forEach(drink -> System.out.println(drink.toUpperCase()));
        
        drinkWithCa.forEach(each -> {
            System.out.println("--------");
            System.out.println("each = " + each);
        });
    }
}
