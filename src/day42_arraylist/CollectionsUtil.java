package day42_arraylist;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);

        System.out.println("reverse = "+letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("max value = " + Collections.max(letters));
        System.out.println("min value = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("after replaceAll = "+ letters);

        Collections.sort(letters);
        System.out.println("after sort = " + letters);

        Collections.sort(letters, Collections.reverseOrder());
        System.out.println("letters after reverse sort = " + letters);

        Collections.shuffle(letters);
        System.out.println("letters after shuffle = " + letters);



    }
}
