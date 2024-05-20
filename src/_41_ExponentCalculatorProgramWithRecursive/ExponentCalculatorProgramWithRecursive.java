package _41_ExponentCalculatorProgramWithRecursive;

import java.util.Scanner;

public class ExponentCalculatorProgramWithRecursive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to be exponentiated : ");
        int base = input.nextInt();

        System.out.print("Enter the number to be the exponent : ");
        int exponent = input.nextInt();

        if (exponent < 0) {
            while (exponent < 0) {
                System.out.print("Please enter a non-negative number : ");
                exponent = input.nextInt();
            }
        }

        int result = calculateExponent(base, exponent);

        System.out.println(base + "^" + exponent + " = " + result);
    }

    private static int calculateExponent(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * calculateExponent(base, exponent - 1);
        }
    }
}
