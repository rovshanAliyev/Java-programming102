package day40_arraylist;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.get(2));

        nums.remove(1);
        System.out.println(nums);
    }
}
