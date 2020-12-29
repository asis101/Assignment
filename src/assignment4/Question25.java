package assignment4;

import javax.swing.*;
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        int highestScore = 0;
        String highestScoreName = "";
        int numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog("enter number of student"));
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= numberOfStudents ; i++) {
            System.out.print("Student " + i + "\n Name: ");
            String name = input.next();
            System.out.print(" Score: ");
            int score = input.nextInt();

            if (score > highestScore){
                highestScore = score;
                highestScoreName = name;
            }
        }
        System.out.println("Student with the highest score: " + highestScoreName);
    }
}
