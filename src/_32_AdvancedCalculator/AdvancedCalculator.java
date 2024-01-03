package _32_AdvancedCalculator;

import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int select;

        String menu = ""
                + "1- Addition Process\n"
                + "2- Subtraction Process\n"
                + "3- Multiplication Process\n"
                + "4- Division Process\n"
                + "5- Exponential Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Mod Process\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Exit";

        do {

            System.out.println(menu);

            System.out.print("Please select an action : ");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again.");
            }
        } while (select != 0);

    }

    static void plus() {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter : ");
        int counter = input.nextInt();

        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result += number;
        }

        System.out.println("Result : " + result);
    }

    static void minus() {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter : ");
        int counter = input.nextInt();

        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {

        Scanner input = new Scanner(System.in);

        int number, result = 1;

        System.out.print("How many numbers will you enter : ");
        int counter = input.nextInt();


        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter : ");
        int counter = input.nextInt();

        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base value : ");
        int base = input.nextInt();

        System.out.print("Enter exponent value : ");
        int exponent = input.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = input.nextInt();

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void mod() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the mod: ");
        int mod = input.nextInt();

        int result = number%mod;

        System.out.println("Result: " + result);
    }

    public static void rectangle() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}