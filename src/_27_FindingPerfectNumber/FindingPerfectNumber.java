package _27_FindingPerfectNumber;

import java.util.Scanner;

public class FindingPerfectNumber {
    public static void main(String[] args) {
        int number, sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println("The number entered is the perfect number.");
        } else {
            System.out.println("The number entered is not a perfect number.");
        }
    }
}