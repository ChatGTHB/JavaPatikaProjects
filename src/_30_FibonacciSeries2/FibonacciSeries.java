package _30_FibonacciSeries2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the order of the Fibonacci numbers you want to see: ");
        int number = input.nextInt();

        System.out.println(fibonacci(number));
    }

    static int fibonacci(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}