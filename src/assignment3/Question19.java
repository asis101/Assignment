package assignment3;

import javax.swing.*;

public class Question19 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("enter side a of the triangle"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("enter side b of the triangle"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("enter side c of the triangle"));

        if (a == b && b== c) {
            JOptionPane.showMessageDialog(null, "Triangle formed is Equilateral");
        } else if (a == b || a == c || b == c) {
            JOptionPane.showMessageDialog(null, "Triangle formed is Isoceles");
        } else {
            JOptionPane.showMessageDialog(null, "Triangle formed is Scalene");
        }
    }
}
