package officeHours.Practice_3_29;

public class Move1stWord {
    public static void main(String[] args) {
        String str = "Java is a fun language";
        str = str.trim();
        System.out.println(str);
        int space = str.indexOf(" ");
        String firstWord = str.substring(0, space);
        System.out.println(firstWord);
        System.out.println(str.substring(space+1) + " " + firstWord);
    }
}
