package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String sentece = "java strings are fun";
        System.out.println(sentece);
        System.out.println(sentece.replace("a","u"));
        System.out.println(sentece.replace("strings","conditions"));
        System.out.println(sentece.replace("java ",""));
    }
}
