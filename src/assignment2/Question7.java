package assignment2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        double r = input.nextDouble();
        System.out.println("Enter the length of cylinder");
        double l = input.nextDouble();

        double volume = Math.PI * r * r * l;
        System.out.println("Volume of cylinder with " + r + " radius and " + l + " length is " + volume);
    }
}
