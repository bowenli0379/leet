package Array;

import java.util.Arrays;

public class SetMatrixZeroes_73 {
    public static int[][] setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] rowZeroes = new boolean[m];
        boolean[] colZeroes = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowZeroes[i] = true;
                    colZeroes[j] = true;
                }
            }
        }
        //列（j）动行（i）不动
        for (int i = 0; i < m; i++) {
            if (rowZeroes[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        //行（j）动列（i）不动
        for (int i = 0; i < n; i++) {
            if (colZeroes[i]) {
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(setZeroes(matrix)[i]));
        }
    }
}
