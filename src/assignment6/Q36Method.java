package assignment6;

import java.util.Scanner;

public class Q36Method {

    public static void findDuplicateElement(int[] arr) {
        int count = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    num = arr[i];
                    count++;
                    System.out.print(num + "\t");
                }
            }
        }
        System.out.println();
        System.out.println("the duplicate element count is: " + count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Q35Method.takeInputInArray(input);
        System.out.println("the duplicate element:");
        Q36Method.findDuplicateElement(arr);

    }
}
