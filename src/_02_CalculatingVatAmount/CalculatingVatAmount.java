package calculatingVatAmount;

import java.util.Scanner;
public class CalculatingVatAmount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a price : ");

        double priceWithoutVAT = input.nextDouble();
        double PriceWithVAT = priceWithoutVAT * 118 / 100;
        double vatAmount = priceWithoutVAT * 18 / 100;

        System.out.println("Price without VAT = " + priceWithoutVAT + "\n" +
                "Price with VAT = " + PriceWithVAT + "\n" +
                "VAT amount = " + vatAmount);
    }
}
