package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Washington Dc");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("LA");
        //add seatlle to 0 index
        cities.add(0, "Seattle");
        System.out.println(cities);
        System.out.println("first cities: "+ cities.get(0));
        System.out.println("last cities: "+ cities.get(4));
        System.out.println("last cities: " + cities.get(cities.size()-1));
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();
        for (String city : cities) {
            System.out.print(city+" ");
        }
        System.out.println();
        cities.remove(3);
        cities.remove("New York");
        System.out.println("after remove: " + cities);

        cities.clear();
        System.out.println("cities = " + cities);
    }
}
