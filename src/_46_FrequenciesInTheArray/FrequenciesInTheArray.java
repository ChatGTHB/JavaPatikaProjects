package _46_FrequenciesInTheArray;

import java.util.Scanner;
public class FrequenciesInTheArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] frequencies = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                    frequencies[j] = -1;
                }
            }
            if (frequencies[i] != -1) {
                frequencies[i] = counter;
            }
        }

        System.out.println("Array Elements and Frequencies:");

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] != -1) {
                System.out.println(array[i] + " : " + frequencies[i]);
            }
        }
    }
}
