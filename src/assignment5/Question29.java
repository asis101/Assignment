package assignment5;

import javax.swing.*;

public class Question29 {
    public double mathEquation (double n) {
        double num;
        double sum = 0;
        double fac = 1;
        for (int i = 1; i <= n; i++) {
            num = i;
            fac = fac * i;
            sum = sum + (num / fac);
        }
        return sum;
    }

    public static void main(String[] args) {
    Question29 ob = new Question29();
    double num = Double.parseDouble(JOptionPane.showInputDialog("Enter number"));
    double sum = ob.mathEquation(num);
        System.out.println("the sum is: " + sum);
    }
}
