package Lesson4;

public class TwoDimArray {
    public static int [][] transpose(int[][] matrix) {
        int height = matrix.length, width = matrix[0].length;
        int[][] transMatrix = new int[width][height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }

        return transMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11}
        };

        printMatrix(matrix);
        int[][] transMatrix = transpose(matrix);
        System.out.print("\n");
        printMatrix(transMatrix);
    }
}
