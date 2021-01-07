package assignment6;

import java.util.Scanner;

public class Q33Method {
    public static int[] sortArrayInAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        for (int a : arr) {
            System.out.print(a + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Q35Method.takeInputInArray(input);
        System.out.println("the given array is:");
        Q33Method.displayArray(arr);
        int[] newArr =Q33Method.sortArrayInAscending(arr);

        System.out.println();
        System.out.println("the array in ascending order is:");
        Q33Method.displayArray(newArr);

    }
}
