package assignment3;

import javax.swing.*;

public class Question21 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter number: 1 to 7"));

        switch (a){
            case 1:
                JOptionPane.showMessageDialog(null,a + " => Sunday");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,a + " => Monday");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,a + " => Tuesday");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,a + " => Wednesday");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,a + " => Thursday");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,a + " => Friday");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,a + " => Satday");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Wrong option entered");
                break;
        }
    }
}
