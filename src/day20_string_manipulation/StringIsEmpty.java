package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);
        System.out.println(jobTitle.equals(""));

        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        } else {
            System.out.println("JobTitle looks good");
        }

        if (jobTitle.length() == 0) {
            System.out.println("JobTItle is empty");
        } else {
            System.out.println("JobTitle is not empty");
        }

        String veggies = "carrot";
        if (!veggies.isEmpty()) {
            System.out.println("we have " + veggies );
        }

    }
}
