package assignment6;

import java.util.Scanner;

public class Question35 {
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

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest && arr[i] > secondLargest )
                secondLargest = arr[i];
        }

        System.out.println();
        System.out.println("Second largest element of given array is: " + secondLargest);

    }
}
