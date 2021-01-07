package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Q32Method {
    public static void sumOfArrayElement(int[] arr){
        int sum =0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter element:");
            arr[i] = input.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of array element is:" + sum);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Q32Method.sumOfArrayElement(arr);
    }
}
