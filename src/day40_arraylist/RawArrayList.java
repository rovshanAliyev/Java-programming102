package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        List list2 = new ArrayList();


        list.add("java");
        list.add("apples");
        list.add(1234);
        list.add(true);

        System.out.println(list);
        System.out.println("size = "+list.size());
    }
}
