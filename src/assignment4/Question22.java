package assignment4;

import java.util.Scanner;

public class Question22 {
    //to print table of given number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to view its table:");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = "+ num * i);
        }
    }
}
