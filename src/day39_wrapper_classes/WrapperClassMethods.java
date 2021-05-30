package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(5, 45));
        System.out.println(Integer.min(66, 45));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Double.max(23.5, 45.6));
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println(Double.compare(5, 1));
        System.out.println(Double.compare(5, 5));
        System.out.println(Double.compare(5, 15));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r'));
        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("uppercase");
        }

        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }
        }


    }
}
