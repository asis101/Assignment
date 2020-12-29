package assignment3;

import javax.swing.*;

public class Question14 {
    //to relate two numbers with == or < or > sign
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));

        if (num1 == num2) {
            JOptionPane.showMessageDialog(null,"First number " + num1 + " = " + "Second number " + num2);
        } else if (num1 > num2) {
            JOptionPane.showMessageDialog(null,"First number " + num1 + " > " + "Second number " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "First number " + num1 + " < " + "Second number " + num2);

        }
    }
}
