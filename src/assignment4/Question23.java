package assignment4;

import javax.swing.*;

public class Question23 {
    //to sum nth natural number
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the nth number:"));
        int sum = 0;
        for (int i = a; i > 0; i--) {
            sum = sum + i;
        }
        System.out.println("sum of " + a + " th natutal number is " + sum);
    }
}
