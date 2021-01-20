package Assignment8;

import java.util.Scanner;

public class Q42 {
    public static String intakeString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a statement");
        String str = input.nextLine();
        return str;
    }

    public static void duplicateWord(String str) {
        int count;

        //Converts the string into lowercase
        str = str.toLowerCase();

        //Split the string into words using built-in function
        String words[] = str.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if (count > 0 && words[i] != "0")
                System.out.println(words[i]);
        }

    }

    public static void main(String[] args) {
        String str = Q42.intakeString();
        Q42.duplicateWord(str);
    }
}
