package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(9);
        int num2 = 15;
        count(num2);
        String word = "wooden spoon";
        count(word.length());
        printAge(1995);
        int birthage = 2001;
        printAge(birthage);
    }
    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAge(int year) {
        System.out.println("Birth year: " + year + " Age: " + (2021 - year));
    }
}
