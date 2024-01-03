package _24_ATMProject;

import java.util.Scanner;

public class ATMProject {

    public static void main(String[] args) {

        String username, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Your username : ");
            username = input.nextLine();
            System.out.print("Your password : ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                right = 0;
                System.out.println("Hello, Welcome to the Kodluyoruz Bank!");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw Money\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit");
                    System.out.print("Please select the action you want to do : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Amount of money : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Amount of money : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance : " + balance);
                            break;
                        case 4:
                            System.out.println("See you again.");
                            break;
                    }
                } while (select != 4);

            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your Remaining Rights: " + right);
                }
            }
        }
    }
}

