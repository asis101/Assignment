package Assignment8;

import java.util.Scanner;

public class Q43 {
    public static void divide(int a, int b) {
        int div = a / b;
        System.out.println("division is: " + div);
    }
    public static void arr(int a, int b){
        int[] ar = new int[1];
        ar[0] = a;
        ar[1] =b;
    }

    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("enter number1:");
        int a = inout.nextInt();
        System.out.println("enter number1:");
        int b = inout.nextInt();

        try {
            divide(a,b);
        } catch (ArithmeticException ae) {
            System.out.println("exception is: " + ae);
        }

        try {
            arr(a,b);
        }catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("exception is: " + ae);
        }

    }
}
