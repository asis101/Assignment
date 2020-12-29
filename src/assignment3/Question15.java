package assignment3;

import javax.swing.*;

public class Question15 {
    //ASCII code to charactor
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("enter number: 0 to 128"));
        if (a > 0 && a < 128) {
            char c = (char) a;
            JOptionPane.showMessageDialog(null, a + "(input) => " + c + "(output)");
        } else
            JOptionPane.showMessageDialog(null, "Enter number is not between 0 to 128");
    }
}
