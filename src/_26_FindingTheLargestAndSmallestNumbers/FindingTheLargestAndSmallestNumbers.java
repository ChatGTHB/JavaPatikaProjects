package _26_FindingTheLargestAndSmallestNumbers;

import java.util.Scanner;

public class FindingTheLargestAndSmallestNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of counting numbers: ");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("The largest number: " + max);
        System.out.println("The smallest number: " + min);

        input.close();
    }
}


