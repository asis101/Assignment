package assignment3;

import javax.swing.*;

public class Question20 {
    // a four function calculator
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));
        char operator = JOptionPane.showInputDialog("Enter the opertor: +, -, * or / ").charAt(0);
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter second number"));

        double result;
        switch (operator) {
            case '+':
                result = a + b;
                JOptionPane.showMessageDialog(null, a + " + " + b + " = " + result);
//                System.out.println(a + b);
                break;
            case '-':
                result = a - b;
                JOptionPane.showMessageDialog(null, a + " - " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                JOptionPane.showMessageDialog(null, a + " * " + b + " = " + result);
                break;
            case '/':
                result = a / b;
                JOptionPane.showMessageDialog(null, a + " / " + b + " = " + result);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Wrong input");
                break;
        }

    }
}
