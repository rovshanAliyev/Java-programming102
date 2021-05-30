package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("first word = " + words[0]);
        System.out.println("second word = " + words[1]);
        System.out.println("third word = " + words[2]);
        for (String each: words) {
            System.out.println(each);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] google = googleResult.split(" ");
        System.out.println("Count = " + google[1]);
        System.out.println("Seconds = " + google[3].replace("(",""));


    }
}
