package _47_MatrixTranspose;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int numRows = scanner.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int numCols = scanner.nextInt();

        int[][] matrix = new int[numRows][numCols];
        int[][] transposeMatrix = new int[numCols][numRows];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose of the matrix: ");
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
