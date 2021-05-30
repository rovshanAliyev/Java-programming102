package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "Azerbaijan";
        System.out.println(word);
        System.out.println(word.length());

        if (word.length() >= 8) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }
}
