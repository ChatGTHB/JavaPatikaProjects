package _19_CombinationCalculation;

import java.util.Scanner;

public class CombinationCalculation {

    public static void main(String[] args) {

        double n = 0, r = 0;

        calculateCombination(n, r);

    }

    private static void calculateCombination(double n, double r) {

        double nFactorial, rFactorial, nMinusRFactorial, combination;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of 'n' : ");
        n = input.nextDouble();

        if (n <= 0) {
            while (n <= 0) {
                System.out.println("n = " + n);
                System.out.print("Enter a positive number : ");
                n = input.nextDouble();
            }
        }

        System.out.print("Enter the value of 'r' : ");
        r = input.nextDouble();

        if ((r <= 0) || (r > n)) {
            System.out.println("n = " + n);
            System.out.println("r = " + r);
            System.out.print("Enter a positive number greater than or equal to 'n' : ");
            r = input.nextDouble();
            while ((r <= 0) || (r > n)) {
                System.out.print("Enter a positive number greater than or equal to 'n' : ");
                r = input.nextDouble();
            }

        }

        nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        nMinusRFactorial = 1;
        for (int i = 1; i <= (n - r); i++) {
            nMinusRFactorial *= i;
        }

        combination = nFactorial / (rFactorial * nMinusRFactorial);
        System.out.println("C(" + n + "," + r + ") = " + combination);
    }
}
