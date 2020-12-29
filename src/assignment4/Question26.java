package assignment4;

import javax.swing.*;

public class Question26 {
    //to reverse the given number
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
        int rem = 0;
        System.out.println("the entered number is " + num);
        while (num > 0) {
            rem = rem * 10 + num % 10;// rem = remainder of number divided by 10
            num = num / 10;//num = new number "dividen"
        }
        System.out.println("the reverse of entered number is "+ rem);
    }
}
