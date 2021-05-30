package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String strPrice = "125.99";
        double price = Double.parseDouble(strPrice);
        System.out.println("price = " + price);
        
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);
        
        String sentence = "i wrote 768 lines of code";
        String[] words =  sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("linesOfCode = " + linesOfCode);
    }
}
