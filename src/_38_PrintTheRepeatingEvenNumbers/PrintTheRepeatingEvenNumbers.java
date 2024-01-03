package _38_PrintTheRepeatingEvenNumbers;

import java.util.HashSet;
import java.util.Set;

public class PrintTheRepeatingEvenNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 12, 12, 14, 15, 16, 16, 17, 18, 18};
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> evens = new HashSet<>();

        for (int number : array) {
            if (number % 2 == 0) {
                if (!evens.add(number)) {
                    duplicates.add(number);
                }
            }
        }
        System.out.println("Duplicate even numbers: " + duplicates);
    }
}
