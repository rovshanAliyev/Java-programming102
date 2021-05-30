package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 6, 15, 54, 90};
        ArrayUtils.printArrays(nums);
        ArrayUtils.printArrays(new int[]{123,4234,465345,54});

        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println(ArrayUtils.sum(new int[]{5,1,5,6,7,8,8,9,56}));

        int[] num2 = {4,1,5,7,8,9};

        System.out.println("5 is found = " + ArrayUtils.contains(num2,5));
        System.out.println("10 is found = " + ArrayUtils.contains(num2,10));




    }
}
