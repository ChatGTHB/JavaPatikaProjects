package _07_Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        n1 = input.nextInt();

        System.out.print("Enter the second number :");
        n2 = input.nextInt();

        System.out.print("1-Add \n2-Subtrack \n3-Multiply \n4-Divide\n");
        System.out.print("Your choice : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Add : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtrack : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiply : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Divide : " + (n1 / n2));
                } else {
                    System.out.println("A number cannot be divided by 0.");
                }
                break;
            default:
                System.out.println("You made the wrong choice. Try again.");
        }
    }
}





