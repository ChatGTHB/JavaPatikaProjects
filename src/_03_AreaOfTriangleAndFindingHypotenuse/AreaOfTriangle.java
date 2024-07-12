package _03_AreaOfTriangleAndFindingHypotenuse;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        int verticalEdge1, verticalEdge2;
        double hypotenuse, area, perimeter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first vertical edge : ");
        verticalEdge1 = input.nextInt();

        System.out.print("Enter the second vertical edge : ");
        verticalEdge2 = input.nextInt();

        hypotenuse = Math.sqrt(Math.pow(verticalEdge1, 2) + Math.pow(verticalEdge2, 2));
        System.out.println("Hypotenuse = " + hypotenuse);

        perimeter = (verticalEdge1 + verticalEdge2 + hypotenuse);

        area = Math.sqrt((perimeter / 2) * ((perimeter / 2) - verticalEdge1) * ((perimeter / 2) - verticalEdge2) * ((perimeter / 2) - hypotenuse));

        System.out.println("Area of triangle = " + area);
    }
}
