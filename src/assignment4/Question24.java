package assignment4;

import javax.swing.*;

public class Question24 {
    //top find factorial of given number
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("enter a number to find its factorial:"));
        int fac = 1;

        for (int i = 1; i <= a; i++) {
            fac = fac * i;
        }
        System.out.println(fac);
    }
}
