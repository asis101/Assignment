package assignment6;

import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        //to input elements of array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element");
            arr[i] = input.nextInt();
        }
        //to sum the elements of array
        for (int a : arr) {
            sum = sum + a ;
        }
        System.out.println("Sum of array elements is: " + sum);
    }
}
