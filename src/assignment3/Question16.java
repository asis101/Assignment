package assignment3;

import javax.swing.*;

public class Question16 {
    //to find wether the number is even or odd
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));

        int rem = num % 2;
        if (rem == 0) {
            JOptionPane.showMessageDialog(null, "Entered number: " + num + " is even");
        } else {
            JOptionPane.showMessageDialog(null, "Entered number: " + num + " is odd");
        }
    }
}
