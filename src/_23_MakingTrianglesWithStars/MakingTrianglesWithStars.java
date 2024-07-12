package _23_MakingTrianglesWithStars;

import java.util.Scanner;

public class MakingTrianglesWithStars {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}