package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int min = 1; min <= 5; min++) {
            System.out.println("\nmin = " + min);
            for (int sec = 1; sec <= 60; sec++) {
                System.out.print(sec + ", ");
            }
        }
        for (int min = 0; min <= 4; min++) {
            for (int sec = 1; sec <= 60; sec++){
                System.out.println(min + ":" + sec);
            }
        }

    }
}
