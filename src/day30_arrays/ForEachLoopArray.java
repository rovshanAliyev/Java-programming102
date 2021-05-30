package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {

        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        for (int eachNum : data) {
            System.out.println(eachNum);
        }

        for (int n : data) {
            System.out.print(n + " ");
        }

        for (int l = 0; l < data.length; l++) {
            System.out.println(data[l]);
        }
        System.out.println("last value: " + data[data.length-1]);

        for (int idx = data.length-1; idx >= 0; idx--) {
            System.out.print(data[idx] + " ");
        }
    }
}