package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix_54 {
    public static List<Integer> SpitalOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return res;

        int up = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (up <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            up++;

            for (int i = up; i <= down; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if (up <= down) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[down][i]);
                }
                down--;
            }

            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(SpitalOrder(matrix));
    }
}
