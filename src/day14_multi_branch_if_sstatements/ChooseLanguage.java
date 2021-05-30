package day14_multi_branch_if_sstatements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your language:");
        int selection = scan.nextInt();
        if (selection == 1) {
            System.out.println("Hello, thank you for call");
        } else if (selection == 2) {
            System.out.println("Hola, gracias para llamar");
        } else if (selection == 3) {
            System.out.println("Merhaba, aradiginiz ucun tesekkurler");
        } else if (selection == 4) {
            System.out.println("Priver, spasibo za vash zvonok");
        } else if (selection == 5) {
            System.out.println("Merci, pour votre appel");
        } else {
            System.out.println("Lets talk Java");
        }
    }
}
