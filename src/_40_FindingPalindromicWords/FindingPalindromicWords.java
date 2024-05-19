package _40_FindingPalindromicWords;

import java.util.Scanner;

public class FindingPalindromicWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        if (word.contentEquals(sb)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is not a palindrome.");
        }
    }
}
