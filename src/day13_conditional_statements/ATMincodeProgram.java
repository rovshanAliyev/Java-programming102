package day13_conditional_statements;

import java.util.Scanner;

public class ATMincodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        System.out.println("Write your PINCODE: ");
        int secretPincode = 2233;
        Scanner scan = new Scanner(System.in);
        int inputPincode = scan.nextInt();
        //int inputPincode = 2233;

       if (secretPincode == inputPincode) {
            System.out.println("Welcome to your account");
            System.out.println("You can check your balance, withdraw, and deposit");
        } else {
            System.out.println("Incorrect pincode! " + inputPincode);
            System.out.println("Please try again");
        }
        System.out.println("Thank you for using TD Bank ATM!");
    }
}
