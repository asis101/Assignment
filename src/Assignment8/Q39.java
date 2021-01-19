package Assignment8;

import java.util.Scanner;

public class Q39 {
    public static String intakeName() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter you full name");
        String fullName = input.nextLine();
        return fullName;
    }

    public static void shortName(String fullName){
        String[] names = fullName.split(" ");

        System.out.println("name in short form is:");
        for (int i = 0; i < names.length - 1; i++) {
            System.out.print(names[i].toUpperCase().charAt(0) + ". ");
        }
        System.out.print(names[names.length - 1].toUpperCase());
    }

    public static void main(String[] args) {
        String name = Q39.intakeName();
        Q39.shortName(name);

    }
}
