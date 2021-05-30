package day37_methods_overloading;

import javax.security.auth.Subject;
import javax.swing.*;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginWorld("axc", "jok");
        System.out.println(login("cybertekStident", "abc123"));

        if (login("cybertekStident", "abc123")) {
            System.out.println("login perfect");
        } else {
            System.out.println("login not perfect");
        }

        boolean isLoginSuccessful = login("nadir", "salam");
        System.out.println("isLoginSuccessful = " + isLoginSuccessful);
    }

    public static void loginWorld(String userName, String passwrod) {
        String secretUserName = "cybertekStident";
        String secretPassord = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && passwrod.equals(secretPassord)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login unsuccessful");
        }
    }

    public static boolean login(String userName, String passwrod) {
        String secretUserName = "cybertekStident";
        String secretPassord = "abc123";
//        return userName.equalsIgnoreCase(secretUserName) && passwrod.equals(secretPassord);
        if (userName.equalsIgnoreCase(secretUserName) && passwrod.equals(secretPassord)) {
            return true;
        } else {
            return false;
        }
    }
}