package _08_UserLogin;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String username, password, newPassword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Your username : ");
        username = input.nextLine();

        System.out.print("Your password : ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("You are logged in.");
        } else if (username.equals("patika")) {
            System.out.println("Wrong password; do you want to reset your user password?");
            System.out.print("1-Yes \n2-No\n");
            System.out.print("Your choice : ");
            select = input.nextInt();
            input.nextLine();

            if (select == 1) {
                System.out.print("Enter your new password : ");
                newPassword = input.nextLine();
                if (newPassword.equals(password) || newPassword.equals("java123")) {
                    System.out.println("Could not create new password, please enter another password.");
                } else {
                    System.out.println("New password created.");
                }
            }
        } else {
            System.out.println("Your information is wrong.");
        }
    }
}





