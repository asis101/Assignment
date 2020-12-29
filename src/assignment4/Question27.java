package assignment4;

import javax.swing.*;

public class Question27 {
    public static void main(String[] args) {
        //to find sum and product of each digit of given number
        int num = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
        int sum = 0;
        int product = 1;

        System.out.println("enterded number is " + num);
        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem;
            product = product * rem;
        }
        System.out.println("sum is " + sum + " & prouduct is " + product);
    }

}
