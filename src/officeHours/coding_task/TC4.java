package officeHours.coding_task;

public class TC4 {
    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF"));

    }
    public static String unique(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int num = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    num++;

                }
            }

            if (num==1){
                unique += str.charAt(i);
            }
        }
        return unique;
    }
}
