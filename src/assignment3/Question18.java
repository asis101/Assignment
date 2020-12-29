package assignment3;

import javax.swing.*;

public class Question18 {
    //to find largest among three numbers
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("enter first number"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("enter third number"));

        if (a > b) {
            if (a > c) {
                JOptionPane.showMessageDialog(null, "First number: " + a + " is the largest");
            } else {
                JOptionPane.showMessageDialog(null, "Third number: " + c + " is the largest");
            }
        } else if (b > c) {
            JOptionPane.showMessageDialog(null, "Second number: " + b + " is the largest");
        }else {
            JOptionPane.showMessageDialog(null, "Third number: " + c + " is the largest");
        }
    }
}
