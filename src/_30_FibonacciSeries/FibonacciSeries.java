package _30_FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a limit number for the Fibonacci series: ");
        int maxNumber = input.nextInt();

        int previousNumber = 0;
        int currentNumber = 1;

        System.out.print("Fibonacci Series up to " + maxNumber + ": ");

        if (maxNumber >= 0) {
            System.out.print(previousNumber + " ");
        }

        while (currentNumber <= maxNumber) {
            System.out.print(currentNumber + " ");
            int nextNumber = currentNumber + previousNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
    }
}