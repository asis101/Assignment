package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Q35Method {

    public static int[] takeInputInArray(Scanner input) {
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void findSecondLargestElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("the given array is:");
        System.out.println(Arrays.toString(arr));
        System.out.println("the second largest element is " + arr[arr.length - 2]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Q35Method.takeInputInArray(input);
        Q35Method.findSecondLargestElement(arr);
    }
}
