package _04_AreaAndPerimeterOfCircle;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        double pi = 3.14, area, radius, centerAngle;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        radius = input.nextDouble();

        System.out.print("Enter the circle center angle value : ");
        centerAngle = input.nextDouble();

        area = (pi * (radius * radius) * centerAngle) / 360;

        System.out.println("Area = " + area);
    }
}
