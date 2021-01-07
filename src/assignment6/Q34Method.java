package assignment6;

import java.util.Scanner;

public class Q34Method {
    public static int[] reverseArray(int[] arr) {
        int size = arr.length;
        int[] newArr = new int[size];
        for (int a: arr) {
          newArr[size -1] = a;
          size--;
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Q35Method.takeInputInArray(input);
        System.out.println("the given array is:");
        Q33Method.displayArray(arr);

        int[] newArr =Q34Method.reverseArray(arr);
        System.out.println();
        System.out.println("the array in reverse order is:");
        Q33Method.displayArray(newArr);

    }
}
