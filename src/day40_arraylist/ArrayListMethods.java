package day40_arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? " + shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("list is not empty");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if (shoppingList.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("list is not empty");
        }

        int count = shoppingList.size();
        System.out.println("items to buy = "+count);

        System.out.println("is shoes on my list = " + shoppingList.contains("shoes"));
        if (shoppingList.contains("shoes")) {
            System.out.println("shoes is on my list");
        } else {
            System.out.println("shoes is not on my list");
        }
        System.out.println("buying shoes for $80");
        shoppingList.remove("shoes");
        System.out.println("list = " + shoppingList);
        System.out.println("done shopping");
        shoppingList.clear();
        System.out.println("shoppingList = " + shoppingList);
    }
}
