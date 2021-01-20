package Assignment8;

import java.util.Scanner;

public class Q41 {
    public static String intakeString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        return word;
    }
    public static void duplicateLetter(String word) {
        char[] inp = word.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String word = Q41.intakeString();
        Q41.duplicateLetter(word);
    }
}
