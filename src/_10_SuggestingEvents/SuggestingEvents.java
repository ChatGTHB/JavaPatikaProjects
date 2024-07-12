package _10_SuggestingEvents;

import java.util.Scanner;

public class SuggestingEvents {
    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature : ");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("You can ski.");
        } else if (temperature < 15) {
            System.out.println("You can go cinema.");
        } else if (temperature > 15 && temperature < 25) {
            System.out.println("You can go picnic.");
        } else {
            System.out.println("You cn go swimming.");
        }
    }
}