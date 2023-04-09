package calculatingVatAmount;

import java.util.Scanner;

public class CalculatingVatAmountVersion2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a price : ");

        double price, priceWithVAT, vatAmount;
        price = input.nextDouble();

        if (price <= 1000 && price >= 0) {
            priceWithVAT = price * 118 / 100;
            vatAmount = price * 18 / 100;
            System.out.println("Price = " + price + "\n" +
                    "Price with VAT = " + priceWithVAT + "\n" +
                    "VAT amount = " + vatAmount);
        } else if (price > 1000) {
            priceWithVAT = price * 108 / 100;
            vatAmount = price * 8 / 100;
            System.out.println("Price = " + price + "\n" +
                    "Price with VAT = " + priceWithVAT + "\n" +
                    "VAT amount = " + vatAmount);
        } else System.out.println("You have entered incorrectly value.");
    }
}
