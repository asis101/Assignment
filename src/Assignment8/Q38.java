package Assignment8;

import java.util.Scanner;

public class Q38 {
    public static String intakeWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        return word;
    }

    public static boolean checkPalindrome(String word) {
        String rev = "";
        int length = word.length();

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }

        if (word.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = Q38.intakeWord();
        boolean isPalindrome = Q38.checkPalindrome(str);

        if (isPalindrome) {
            System.out.println("the word " + str + " is Palindrome");
        } else {
            System.out.println("the word " + str + " is not Palindrome");
        }
    }
}
