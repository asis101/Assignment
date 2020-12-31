package assignment5;

import javax.swing.*;

public class Question28 {

    public boolean isPrimeNumber(int num) {
        boolean isPrime = true;

        if (num == 0 || num == 1) {
            isPrime = false;
            return isPrime;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public void firstNthPrime(int nth) {
        System.out.printf("the first %dth prime numbers are:\n", nth);
        int i;
        int num = 1;
        int count = 0;

        while (count < nth) {
            num++;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                System.out.print(i + "\t");
                count++;
            }
        }
    }

    public void allPrimeBetween(int start, int end) {
        System.out.println();
        System.out.printf("the prime numbers between %d and %d are:\n", start, end);
        int i;
        int num = start;

        while (num >= start && num < end - 1) {
            num++;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                System.out.print(i + "\t");
            }
        }

    }

    public static void main(String[] args) {
        Question28 ob1 = new Question28();
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        boolean isPrime = ob1.isPrimeNumber(a);
        if (isPrime) {
            System.out.println(a + " is a Prime Number");
        } else {
            System.out.println(a + " is not a Prime Number");
        }

        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to find its first nth prime numbers:"));
        ob1.firstNthPrime(b);


        int start = Integer.parseInt(JOptionPane.showInputDialog("Enter start number:"));
        int end = Integer.parseInt(JOptionPane.showInputDialog("Enter end number:"));
        ob1.allPrimeBetween(start, end);
    }
}
