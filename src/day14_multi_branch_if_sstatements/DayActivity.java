package day14_multi_branch_if_sstatements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "windy";
        if (weather.equals("sunny")) {
            System.out.println(weather + "Go to park");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + "Stay home");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + "Clean the car");
        } else if (weather.equals("windy")) {
            System.out.println(weather + "Get ready for power lost");
        } else {
            System.out.println(weather + "Keep coding Java");
        }
    }
}
