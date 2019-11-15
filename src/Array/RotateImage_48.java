package Array;

import java.util.Arrays;

public class RotateImage_48 {

    public static int[][] rotate(int[][] matrix){
        int n = matrix.length-1;
        for (int i = 0; i <= n; i++)
            reverse(matrix[i]);

        //int m = n;
        for (int i = 0;  i < n; i++){
            for (int j = 0; j < n-i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j][n-i];
                matrix[n-j][n-i] = temp;
            }
        }
        return matrix;
    }
    private static void reverse(int[] line){
        int left = 0, right = line.length-1;
        while (left < right) {
            int temp = line[left];
            line[left++] = line[right];
            line[right--] = temp;
        }
    }
    public static  void main(String[] args){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                         };
        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(rotate(matrix)[i]));
    }
}
