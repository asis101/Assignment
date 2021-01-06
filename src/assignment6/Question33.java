package assignment6;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        int arraySize, temp;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        arraySize = input.nextInt();

        int[] arr = new int[arraySize];
        //to input elements of array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the element");
            arr[i] = input.nextInt();
        }
        System.out.println("the given array is:");
        //to display the given array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //to sort in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Ascending order of given array is:");
        //to display the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
