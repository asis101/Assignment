package assignment2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pound to be converted");
        double pound = input.nextDouble();
        double kg = pound / 2.205;
        System.out.print(pound + " lb is equvalent to ");
        System.out.print(String.format("%.3f", kg));

    }
}
