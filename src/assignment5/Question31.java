package assignment5;

import javax.swing.*;

public class Question31 {
    public void pattern(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum * 10 + i;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Question31 ob = new Question31();
        int patternNum = Integer.parseInt(JOptionPane.showInputDialog("Enter pattern number to be dispalyed:"));
        ob.pattern(patternNum);
    }
}
