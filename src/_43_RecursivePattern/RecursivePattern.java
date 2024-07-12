package _43_RecursivePattern;

import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        decreaseIncrease(number);
    }

    private static void decreaseIncrease(int number) {
        System.out.print(number + " ");

        if (number <= 0) {
            return;
        }
        decreaseIncrease(number - 5);
        System.out.print(number + " ");
    }
}
