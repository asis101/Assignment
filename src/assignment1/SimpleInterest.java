package assignment1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal");
        double p = input.nextDouble();
        System.out.println("Enter the time period in year");
        double t = input.nextDouble();
        System.out.println("Enter the interest rate");
        double r = input.nextDouble();

        double sInterest = p * t * r / 100;

        System.out.println("Simple Interest for Principal: "+p+" , Time period: "+t+" year & interest rate: "+r+" % is: "+sInterest);
    }
}
