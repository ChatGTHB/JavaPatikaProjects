package _04_AreaAndPerimeterOfCircle;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {

        double pi = 3.14, perimeter, area, radius;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        radius = input.nextDouble();

        area = pi * radius * radius;
        perimeter = 2 * pi * radius;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
