package assignment2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //for area of circle
        double d = 19.56;
        double aCircle = Math.PI * d * d / 4;
        System.out.println("Area of Circle with " + d + " diameter is " + aCircle);

        //for area of rectangle
        double l = 20.4;
        double b = 9.8;
        double aRect = l * b;
        System.out.println("area of rectangle with " + l + " length & " + b + " breadth is " + aRect);

        //for area of triangle
        double bs = 14.5;
        double h = 20.9;
        double aTri = 0.5 * bs * h;
        System.out.println("area of triangle with " + bs + " base & " + h + " height is " + aTri);
    }
}
