package _14_ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {

        int birthYear, remainder;
        String zodiac = null;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth : ");
        birthYear = input.nextInt();

        remainder = birthYear % 12;

        switch (remainder) {
            case 0: {
                zodiac = "Monkey";
                break;
            }
            case 1: {
                zodiac = "Rooster";
                break;
            }
            case 2: {
                zodiac = "Dog";
                break;
            }
            case 3: {
                zodiac = "Pig";
                break;
            }
            case 4: {
                zodiac = "Mouse";
                break;
            }
            case 5: {
                zodiac = "Ox";
                break;
            }
            case 6: {
                zodiac = "Tiger";
                break;
            }
            case 7: {
                zodiac = "Rabbit";
                break;
            }
            case 8: {
                zodiac = "Dragon";
                break;
            }
            case 9: {
                zodiac = "Snake";
                break;
            }
            case 10: {
                zodiac = "Horse";
                break;
            }
            case 11: {
                zodiac = "Sheep";
                break;
            }
        }
        System.out.println("Your Chinese Zodiac Horoscope : " + zodiac);
    }
}





