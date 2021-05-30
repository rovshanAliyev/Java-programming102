package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilsTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("Fail: cannot be null or empty");
        }
        System.out.println("isPalidrome(civic) = " + StringUtils.isPalidrome("civic"));
        System.out.println("isPalidrome(salam) = " + StringUtils.isPalidrome("salam"));
        System.out.println("isPalidrome(alla) = " + isPalidrome("alla"));
        System.out.println("isPalidrome(Cybertek) = " + isPalidrome("Cybertek"));
        
        
        String word = "java";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
        System.out.println(StringUtils.reverse(word));

    }
}
