package _13_CalculationOfFlightTicket;

import java.util.Scanner;

public class CalculationOfFlightTicket {
    public static void main(String[] args) {
        int distance, age, typeOfTrip;
        double ticketAmount = 0;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in km : ");
        distance = input.nextInt();

        ticketAmount = distance * ((double) 10 / 100);

        System.out.print("Enter your age : ");
        age = input.nextInt();

        if (age < 12) {
            ticketAmount -= ticketAmount *= 50.0 / 100;
        } else if (age <= 24) {
            ticketAmount -= ticketAmount *= 10.0 / 100;
        } else if (age > 65) {
            ticketAmount -= ticketAmount *= 30.0 / 100;
        }

        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip): ");
        typeOfTrip = input.nextInt();

        if (typeOfTrip == 2) {
            ticketAmount -= ticketAmount *= 20.0 / 100;
            ticketAmount *= 2;
        }

        if (distance < 0 || age < 0 || (typeOfTrip < 1 || typeOfTrip > 2)) isError = true;
        if (isError) {
            System.out.print("You Entered Wrong Data!");
        } else System.out.print("Total Amount = " + ticketAmount + " TL");
    }
}