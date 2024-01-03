package _21_SumOfDigitsCalculate;

import java.util.Scanner;

public class SumOfDigitsCalculate {

    public static void main(String[] args) {

        int number = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();

        calculateSumOfDigits(number);


    }

    private static void calculateSumOfDigits(int number) {

        int sumOfDigits = 0;

        while (number != 0) {
            sumOfDigits += number % 10;
            number = number / 10;
        }

        System.out.println("Sum of digits = " + sumOfDigits);
    }

}

