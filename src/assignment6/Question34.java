package assignment6;

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int arraySize = input.nextInt();

        int[] arr = new int[arraySize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the element");
            arr[i] = input.nextInt();
        }
        System.out.println("the given array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        int[] newArr = new int[arraySize];

        for (int i = 0; i < arr.length; i++) {
            newArr[arraySize - 1] = arr[i];
           arraySize--;
        }
        System.out.println();
        System.out.println("the reverse of given array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}
