package officeHours.coding_task;

public class TC3 {
    /*
    Write a return method that can remove the duplicated values from String
    Ex:  removeDup("AAABBBCCC")  ==> ABC
     */
    public static void main(String[] args) {
        System.out.println(removed("AAABBBCCC"));

    }

    public static String removed(String str) {
        String noDuplicate = "";
        for (int i = 0; i < str.length(); i++) {
            if (!noDuplicate.contains(str.charAt(i) + "")) {
                noDuplicate += str.charAt(i);
            }
        }

    return noDuplicate;
    }

}
