package _12_FindingHoroscopes;

import java.util.Scanner;

public class FindingHoroscopes {

    public static void main(String[] args) {

        String month;
        int day;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month you were born :");
        month = input.nextLine();

        System.out.print("Enter the day you were born : ");
        day = input.nextInt();


        if (month.equalsIgnoreCase("January")) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("Capricorn");
                } else {
                    System.out.println("Aquarius");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("February")) {
            if (day >= 1 && day <= 29) {
                if (day < 20) {
                    System.out.println("Aquarius");
                } else {
                    System.out.println("Pisces");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("March")) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("Pisces");
                } else {
                    System.out.println("Aries");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("April")) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Taurus");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("May")) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Taurus");
                } else {
                    System.out.println("Gemini");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("June")) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    System.out.println("Gemini");
                } else {
                    System.out.println("Cancer");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("July")) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Cancer");
                } else {
                    System.out.println("Leo");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("August")) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Virgo");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("September")) {
            if (day >= 1 && day <= 30) {
                if (day < 24) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Libra");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Oktober")) {
            if (day >= 1 && day <= 31) {
                if (day < 24) {
                    System.out.println("Libra");
                } else {
                    System.out.println("Scorpio");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("November")) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    System.out.println("Scorpio");
                } else {
                    System.out.println("Sagittarius");
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("December")) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    System.out.println("Sagittarius");
                } else {
                    System.out.println("Pisces");
                }
            } else {
                isError = true;
            }
        } else {
            System.out.println("You entered incorrectly, enter the month you were born.");
        }

        if (isError) {
            System.out.println("You entered incorrectly, There is no number of days you entered in the month you were born.");
        }
    }
}





