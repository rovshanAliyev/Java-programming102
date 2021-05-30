package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "githubu";
        char letter ='u';
        int index = -1;

        for (int n = 0; n < word.length(); n++) {
//            System.out.println(n + " - " + word.charAt(n));
        if (word.charAt(n) == letter) {
            index = n;
            System.out.println(letter + " is found at index " + index);
            break;
            }
        }

        if (index == -1) {
            System.out.println(letter + " not found");
        } else {
            System.out.println(letter + " is found at index " + index);
        }


    }
}
