package day36_methods_with_return;

import java.util.*;

public class Info {
    public static void main(String[] args) {
        System.out.println("Full name = " + fullName());
        System.out.println("Married = " +isMarried());
        System.out.println("Age = " + getAge());
        System.out.println("Birth year = " + getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
    }
    public static String fullName() {
        return "Rovshan Aliyev";
    }
    public static boolean isMarried() {
        return true;
    }
    public static int getAge() {
        int age = 26;
        return age;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
