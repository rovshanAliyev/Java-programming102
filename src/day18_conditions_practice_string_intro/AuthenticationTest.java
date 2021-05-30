package day18_conditions_practice_string_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
        int expLast4SSN = 1234;
        int expPinCode = 4321;

        int last4SNN = 123;
        int pinCode = 432;
        if (last4SNN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SNN != expLast4SSN) {
                System.out.println("Last 4 of SSN did not match");
            }
            if (pinCode != expPinCode) {
                System.out.println("Pin code did not match");
            }
        }
    }
}
