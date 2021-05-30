package day33_arrays;

import java.util.Arrays;

public class MultiDArrayExample {
    public static void main(String[] args) {
        String[][] users = { {"Rovshan" , "Aliyev"} ,
                             {"Anna" , "Ziyayeva"} ,
                             {"Pervin" , "Altae"} };
        System.out.println(users[0][0]);
        System.out.println(users[1][0]);
        System.out.println(users[2][0]);

        System.out.println(users[0][1]);
        System.out.println(users[1][1]);
        System.out.println(users[2][1]);

        System.out.println(Arrays.deepToString(users));

    }
}
