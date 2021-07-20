package day62_collections;

import day55_abstraction.flags.FrenchFlag;

import java.util.*;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();

        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(23);
        scores.add(23);
        scores.add(42);
        System.out.println(scores);
        System.out.println("" + scores.get(0));

        friends.add("Mahliya");
        friends.add("Rovshan");
        friends.add("Zahid");

        friends.addFirst("Leila");
        System.out.println(friends);

    }
}
