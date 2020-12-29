package assignment2;

import javax.swing.*;

public class Question12 {
    public static void main(String[] args) {
        int roll = Integer.parseInt(JOptionPane.showInputDialog("Enter your roll number:"));
        String name = JOptionPane.showInputDialog("Enter your name:");
        String nationality = JOptionPane.showInputDialog("Enter your nationality:");

        JOptionPane.showMessageDialog(null, "Roll Number: " + roll);
        JOptionPane.showMessageDialog(null, "Name: " + name);
        JOptionPane.showMessageDialog(null,"Nationality: " + nationality);
    }
}
