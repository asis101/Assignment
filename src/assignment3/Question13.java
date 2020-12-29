package assignment3;

import javax.swing.*;

public class Question13 {
    //to display number if only it is negative
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number:"));
        if (num < 0) {
            JOptionPane.showMessageDialog(null, "The entered number is negative:" + num);
//            System.out.println("The entered number is negative:" + num);
        } else {
            JOptionPane.showMessageDialog(null, "Entered number is not negative");
//            System.out.println("Entered number is not negative");
        }
    }
}
