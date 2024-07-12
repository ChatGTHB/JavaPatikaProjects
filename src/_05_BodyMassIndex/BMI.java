package _05_BodyMassIndex;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height, weight, bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height (in meters) : ");
        height = input.nextDouble();

        System.out.print("Please enter your weight : ");
        weight = input.nextDouble();

        bodyMassIndex = weight / Math.pow(height, 2);

        System.out.println("Your Body Mass Index = " + bodyMassIndex);
    }
}
