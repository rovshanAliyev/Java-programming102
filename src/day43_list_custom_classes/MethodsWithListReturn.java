package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        long start = System.nanoTime();
        List<Integer> mlnNums = getIntegerList();
        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));

        long st = System.nanoTime();
        int[] arr = getIntArray();
        long en = System.nanoTime();
        System.out.println("Array time = " + (en - st));



    }

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000_000; i++) {
            nums.add(i);

        }
        return nums;
    }

    public static int[] getIntArray() {
        int[] nums = new int[1_000_001];
        for (int i = 0; i <= 1_000_000 ; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
