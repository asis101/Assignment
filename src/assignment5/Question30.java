package assignment5;

import javax.swing.*;

public class Question30 {

    public void fibonacii(int nth) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.printf("the %d th fibonacii series are:\n", nth);
        System.out.print(num1 + "\t" + num2 + "\t");
        for (int i = 2; i < nth; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + "\t");
        }
    }

    public static void main(String[] args) {
        Question30 ob = new Question30();
        int nth = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to find its first nth fibonacii serie:"));
        ob.fibonacii(nth);
    }


}
