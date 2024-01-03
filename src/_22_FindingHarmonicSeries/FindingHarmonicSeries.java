package _22_FindingHarmonicSeries;

import java.util.Scanner;

public class FindingHarmonicSeries {

    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();

        findingHarmonicSeries(number);

    }

    private static void findingHarmonicSeries(int number) {

        double result = 0.0;

        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println(result);
    }
}

