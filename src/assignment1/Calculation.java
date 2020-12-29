package assignment1;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number");
        double num2 = input.nextDouble();

        //for sum
        double sum = num1 + num2;
        //for average
        double avg = sum/2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("Average of " + num1 + " and " + num2 + " is: " + avg);
    }
}
