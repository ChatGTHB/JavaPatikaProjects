package _35_HarmonicMean;

import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = input.nextInt();
        double[] arr = new double[size];
        double sum = 0.0;

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextDouble();
            sum += 1.0 / arr[i];
        }
        double harmonicMean = size / sum;

        System.out.println("Harmonic mean of the array: " + harmonicMean);
    }
}
