package Assignment8;

import java.util.Scanner;

public class Q40 {
    public static String intakeString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to be reversed");
        String word = input.next();
        return word;
    }

    public static void reverseString(String word) {
        char[] s = word.toCharArray();
        char[] reversedWord = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            reversedWord[i] = s[s.length - i - 1];
        }

        System.out.println(reversedWord);
    }

    public static void main(String[] args) {
        String word = Q40.intakeString();
        Q40.reverseString(word);
    }
}
