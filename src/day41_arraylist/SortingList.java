package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList(Arrays.asList(4, 7, 1, 6, 7, 9, 234, 4643, 234));
        System.out.println("before sort: " + nums);

        Collections.sort(nums);

        System.out.println("after sort: " + nums);

    }
}
