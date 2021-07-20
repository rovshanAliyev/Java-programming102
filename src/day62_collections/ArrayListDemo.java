package day62_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        Collection<String> schools = new ArrayList<>();

        cities.add("Mclean");
        cities.add("Federal way");
        cities.add("Washington");

        System.out.println(cities);

        System.out.println("first city " +cities.get(0));
        System.out.println("cities = " + cities.size());


    }
}
