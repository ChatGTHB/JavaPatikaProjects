package _36_FindingNumbersInArray;

import java.util.Arrays;

public class FindingNumbersInArray {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};

        Arrays.sort(array);

        int inputNumber = 5;
        int nearestSmaller = Integer.MIN_VALUE;
        int nearestLarger = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < inputNumber && array[i] > nearestSmaller) {
                nearestSmaller = array[i];
            }
            if (array[i] > inputNumber && array[i] < nearestLarger) {
                nearestLarger = array[i];
            }
        }

        if (nearestSmaller == Integer.MIN_VALUE) {
            nearestSmaller = array[0];
            nearestLarger = array[1];
        } else if (nearestLarger == Integer.MAX_VALUE) {
            nearestSmaller = array[array.length - 2];
            nearestLarger = array[array.length - 1];
        }

        System.out.println("Nearest smaller number to the input: " + nearestSmaller);
        System.out.println("Nearest larger number to the input: " + nearestLarger);
    }
}
