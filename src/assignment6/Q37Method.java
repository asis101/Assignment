package assignment6;

import java.util.Scanner;

public class Q37Method {
    public static int[][] takeInputArray(int num) {
//        System.out.println("Enter no. of row of an array:");
//        int rows = input.nextInt();
//        System.out.println("Enter no. of column of an array:");
//        int columns = input.nextInt();
        System.out.println("Array" + num);
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("enter element: ");
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int[] cc : arr) {
            for (int a : cc) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public static void sumArray(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        int[][] arr1 = Q37Method.takeInputArray(1);
        int[][] arr2 = Q37Method.takeInputArray(2);
        System.out.println();
        Q37Method.printArray(arr1);
        System.out.println(" + ");
        Q37Method.printArray(arr1);
        System.out.println(" = ");
        Q37Method.sumArray(arr1, arr2);

    }
}
