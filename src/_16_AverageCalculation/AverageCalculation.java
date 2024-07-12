package _16_AverageCalculation;

import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {
        int number, counter = 0, total = 0;
        double average = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 12 == 0) {
                total += i;
                counter++;
            }
        }

        try {
            average = (double) total / counter;
        } catch (Exception exception) {
            System.out.println("In division, the denominator cannot be 0.");
        }

        System.out.println("Average = " + average);
    }
}