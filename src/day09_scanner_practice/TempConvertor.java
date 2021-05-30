package day09_scanner_practice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class TempConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** WELCOME TO TEMP CONVERTOR ***** ");
        System.out.println("Enter the fahrenheit temparature:");
        double fah = scan.nextDouble();
        double cel = (fah - 32) *5/9;
        System.out.println(fah + " Fahrenheit in Celsius is " + cel);


    }
}
