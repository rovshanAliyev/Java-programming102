package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";
        String userName = "CYBERTEK";
        String password = "Abc123";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user successfully logged in");
        } else {
            if (!userName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - incorrect username");
            } else {
                System.out.println("Fail - incorrect password");
            }
        }
    }
}
