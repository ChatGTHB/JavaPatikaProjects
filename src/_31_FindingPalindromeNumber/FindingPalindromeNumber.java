package _31_FindingPalindromeNumber;

import java.util.Scanner;

public class FindingPalindromeNumber {
    public static void main(String[] args) {

        System.out.print("Enter the number you wonder if it is a palindrome : ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(isPalindrome(number));
    }

    static String isPalindrome(int number) {

        int tempNumber = number, reverseNumber = 0, lastNumber;
        String result = null;

        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }

        if (number == reverseNumber) {
            result = "Palindrome number";
        } else {
            result = "Not palindrome number";
        }
        return result;
    }
}

