package assignment2;

public class Question6 {
    public static void main(String[] args) {
        //for permeter of circle
        double d = 19.56;
        double pCircle = Math.PI * d;
        System.out.println("Perimeter of Circle with " + d + " diameter is " + pCircle);

        //for area of rectangle
        double l = 20.4;
        double b = 9.8;
        double pRect = 2 * (l * b);
        System.out.println("Perimeter of rectangle with " + l + " length & " + b + " breadth is " + pRect);

        //for area of triangle
        double p = 14.5;
        double q = 20.9;
        double r = 10.34;
        double pTri = p * q * r;
        System.out.println("Perimeter of triangle with three sides " + p + " , " + q + " & " + r + " is "+  pTri);
    }
}
