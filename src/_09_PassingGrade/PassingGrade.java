package _09_PassingGrade;

import java.util.Scanner;

public class PassingGrade {
    public static void main(String[] args) {
        int mathematics, physics, turkish, chemistry, music, totalGrade = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Your mathematics grade : ");
        mathematics = input.nextInt();
        if (mathematics <= 100 && mathematics >= 0) totalGrade += mathematics;

        System.out.print("Your physics grade : ");
        physics = input.nextInt();
        if (physics <= 100 && physics >= 0) totalGrade += physics;

        System.out.print("Your turkish grade : ");
        turkish = input.nextInt();
        if (turkish <= 100 && turkish >= 0) totalGrade += turkish;

        System.out.print("Your chemistry grade : ");
        chemistry = input.nextInt();
        if (chemistry <= 100 && chemistry >= 0) totalGrade += chemistry;

        System.out.print("Your music grade : ");
        music = input.nextInt();
        if (music <= 100 && music >= 0) totalGrade += music;

        double average = totalGrade / 5;

        if (average < 55) {
            System.out.println("You failed the class.");
        } else {
            System.out.println("Congratulations, you passed the class.");
        }
        System.out.print("Your average = " + average);
    }
}