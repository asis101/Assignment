package assignment3;

import java.util.Scanner;

public class Question17 {
    //to calculate leap year
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = input.nextInt();
        boolean isLeap;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }

        if (isLeap == true) {
            System.out.println("the year: " + year + " is leap year");
        } else {
            System.out.println("the year: " + year + " is not leap year");
        }
    }
}
